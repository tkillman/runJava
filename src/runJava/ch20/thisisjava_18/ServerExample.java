package runJava.ch20.thisisjava_18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	
	
	ExecutorService executorService;
	ServerSocket serverSocket;
	Vector<Client> connections = new Vector<>();
	int portNumber =5001;
	String hostIp = "192.168.20.26";

	
	public class Client { //내부 클래스
		
		Socket socket;

		
		public Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		
		void receive() {
			
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {
						while (true) {
							
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							int readByteCount = inputStream.read(byteArr);//클라이언트들에게 오는 메세지 확인
							
							if (readByteCount == -1) {
								throw new IOException();
							}
							
							String message = "요청 처리" + socket.getRemoteSocketAddress() +Thread.currentThread().getName();
							Platform.runLater(() -> {
								displayText(message);
							});

							String data = new String(byteArr, 0, readByteCount, "UTF-8");

							for (Client client : connections) { //클라이언트들에게 모두 메세지 보냄
								client.send(data);
							}

						} // 무한 루프

					} catch (IOException e) {

						try {
							connections.remove(Client.this);
							String message = "클라이언트 통신 안됨" + socket.getRemoteSocketAddress();
							Platform.runLater(() -> {
								displayText(message);
							});

							socket.close();

						} catch (Exception e2) {
							// TODO: handle exception
						}

					}

				}
			};

			executorService.submit(runnable);  // 1
		}

		void send(String data) {
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {

						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr); 
						outputStream.flush();

					} catch (Exception e) {
						try {
							String message = "클라이언트 통신 안됨 :" + socket.getRemoteSocketAddress();
							Platform.runLater(() -> {
								displayText(message);
							});

							connections.remove(Client.this);
							socket.close();

						} catch (Exception e2) {
							// TODO: handle exception
						}

					}
				} //run 메소드
			}; //runnable 정의 끝

			executorService.submit(runnable); //2
		} //send(String data)메소드 끝

	} // 내부 Client class

	void startServer() {
		executorService = Executors.newFixedThreadPool(10);
		/*쓰레드 사용

		1. 서버로 들어오는 메세지 받을 때 1개
		
		2. 서버로 들어오는 다른 사용자 메세지 받을 때 1개 1개

		2. 서버로 들어온 메세지를 클라이언트들에게 보낼 때 1개 send(String data)

		3. 서버가 accept() 할 때 1개
		
		* 3인 이상 채팅하려면 적어도 5개 이상의 쓰레드가 필요하다.
		*/

		try {
			serverSocket = new ServerSocket();
			InetSocketAddress isa = new InetSocketAddress(hostIp, portNumber);
			serverSocket.bind(isa);
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					Platform.runLater(() -> {
						displayText("[서버시작]");
					});

					while (true) {
						try {
							Socket socket = serverSocket.accept();
							String message = "연결 수락 " + socket.getRemoteSocketAddress();
							
							Platform.runLater(() -> {
								displayText(message);
							});

							Client client = new Client(socket);
							connections.add(client);

							Platform.runLater(() -> {
								displayText("연결 개수" + connections.size());
							});

						} catch (Exception e) {
							if (!serverSocket.isClosed()) {
								stopServer();
								break;
							}

						}
					}

				}
			};

			executorService.submit(runnable); //3

		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
				return;
			}
		}

	}//startServer() 메소드

	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();

			}

			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}

			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}

			Platform.runLater(() -> {
				displayText("서버 멈춤");
				btnStartStop.setText("start");

			});

		} catch (Exception e) {
			e.printStackTrace();

		}

	}//stopServer()메소드 종료

	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);

		btnStartStop.setOnAction(e -> {
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else {
				stopServer();
			}
		});

		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		
		primaryStage.setOnCloseRequest(e -> {
			stopServer();
			
		});
		primaryStage.show();

	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	} //displayText(String text) 메소드 종료

	public static void main(String[] args) {
		launch(args);

	}

}
