package runJava.ch20.thisisjava_18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClientExample extends Application {
	Socket socket;
	String hostip = "192.168.20.26";
	int portNumber = 5001;
	String userId=null;
	
	void startClient() {
		Thread tread = new Thread() {

			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress(hostip, portNumber));

					Platform.runLater(() -> {
						displayText("연결 완료" + socket.getRemoteSocketAddress());
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});

				} catch (Exception e) {
					Platform.runLater(() -> {
						displayText("서버 통신 안됨");

					});
					if (!socket.isClosed()) {
						stopClient();
					}

					return;

				}
				receive();
			}

		};
		tread.start();
	} // startClient() 메소드 끝

	void receive() {
		while (true) {
			try {
				byte[] byteArr = new byte[100];
				InputStream inputStream = socket.getInputStream();

				int readByteCount = inputStream.read(byteArr);

				if (readByteCount == -1) {
					throw new IOException();
				}

				String data = new String(byteArr, 0, readByteCount, "UTF-8");
				
				Platform.runLater(() -> {
					displayText(data);
				});

			} catch (Exception e) {
				Platform.runLater(() -> {
					displayText("서버 통신 안됨");
				});
				stopClient();
				break;
			}

		}
	} // receive() 메소드 끝

	void send(String data) {

		Thread thread = new Thread(() -> {
			try {
				byte[] byteArr = data.getBytes("UTF-8");
				OutputStream outputStream = socket.getOutputStream();//서버로 보냄
				outputStream.write(byteArr);
				outputStream.flush();
				Platform.runLater(() -> {
					displayText("보내기 완료");
				});

			} catch (Exception e) {
				Platform.runLater(() -> {
					displayText("서버 통신 안됨");

				});
				stopClient();
			}

		});

		thread.start();
	} // send(String data) 메소드 끝

	void stopClient() {
		try {
			Platform.runLater(() -> {
				displayText("연결 끊음");

				btnConn.setText("start");
				btnSend.setDisable(true);
			});

			if (socket != null && !socket.isClosed()) {
				socket.close();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane stack = new StackPane();
		GridPane grid = new GridPane();
		TextField idField = new TextField();
		Button btn = new Button("아이디 입력");
		grid.addColumn(0, idField);
		grid.addColumn(1, btn);
		stack.getChildren().add(grid);
		grid.setAlignment(Pos.CENTER);

		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));

		root.setCenter(txtDisplay);

		BorderPane bottom = new BorderPane();
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtInput, new Insets(0, 1, 1, 1));

		btnConn = new Button("start");
		btnConn.setPrefSize(60, 30);
		btnConn.setOnAction(e -> {
			if (btnConn.getText().equals("start")) {
				startClient();
			} else {
				stopClient();
			}

		});

		btnSend = new Button("send");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(true);
		btnSend.setOnAction(e -> {
			send("[발신인] " +userId+" : " + txtInput.getText());
			
			txtInput.setText(null);
		});

		root.setOnKeyPressed(e -> enter(e));

		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		root.setBottom(bottom);
		Scene scene = new Scene(stack, 500, 300);

		
		// 버튼이 눌리면
		btn.setOnAction(e -> {
			stack.getChildren().add(root);
			userId= idField.getText();
			
		});

		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(e -> {
			stopClient();
		});

		primaryStage.show();

	}

	void enter(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER) {
			send("[발신인] " +userId+" : " + txtInput.getText());
			txtInput.setText(null);
		}
	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
