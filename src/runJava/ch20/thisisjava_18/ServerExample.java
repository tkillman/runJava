package runJava.ch20.thisisjava_18;

//public class ServerExample extends Application {
	public class ServerExample{
//	
//	ExecutorService executorService;
//	ServerSocket serverSocket;
//	Vector<Client> connections = new Vector<>();
//	int portNumber =5001;
//	String hostIp = "192.168.20.26";
//
//	
//	public class Client { //���� Ŭ����
//		
//		Socket socket;
//
//		
//		public Client(Socket socket) {
//			this.socket = socket;
//			receive();
//		}
//
//		
//		void receive() {
//			
//			Runnable runnable = new Runnable() {
//
//				@Override
//				public void run() {
//					try {
//						while (true) {
//							
//							byte[] byteArr = new byte[100];
//							InputStream inputStream = socket.getInputStream();
//							int readByteCount = inputStream.read(byteArr);//Ŭ���̾�Ʈ�鿡�� ���� �޼��� Ȯ��
//							
//							if (readByteCount == -1) {
//								throw new IOException();
//							}
//							
//							String message = "��û ó��" + socket.getRemoteSocketAddress() +Thread.currentThread().getName();
//							Platform.runLater(() -> {
//								displayText(message);
//							});
//
//							String data = new String(byteArr, 0, readByteCount, "UTF-8");
//
//							for (Client client : connections) { //Ŭ���̾�Ʈ�鿡�� ��� �޼��� ����
//								client.send(data);
//							}
//
//						} // ���� ����
//
//					} catch (IOException e) {
//
//						try {
//							connections.remove(Client.this);
//							String message = "Ŭ���̾�Ʈ ��� �ȵ�" + socket.getRemoteSocketAddress();
//							Platform.runLater(() -> {
//								displayText(message);
//							});
//
//							socket.close();
//
//						} catch (Exception e2) {
//							// TODO: handle exception
//						}
//
//					}
//
//				}
//			};
//
//			executorService.submit(runnable);  // 1
//		}
//
//		void send(String data) {
//			Runnable runnable = new Runnable() {
//
//				@Override
//				public void run() {
//					try {
//
//						byte[] byteArr = data.getBytes("UTF-8");
//						OutputStream outputStream = socket.getOutputStream();
//						outputStream.write(byteArr); 
//						outputStream.flush();
//
//					} catch (Exception e) {
//						try {
//							String message = "Ŭ���̾�Ʈ ��� �ȵ� :" + socket.getRemoteSocketAddress();
//							Platform.runLater(() -> {
//								displayText(message);
//							});
//
//							connections.remove(Client.this);
//							socket.close();
//
//						} catch (Exception e2) {
//							// TODO: handle exception
//						}
//
//					}
//				} //run �޼ҵ�
//			}; //runnable ���� ��
//
//			executorService.submit(runnable); //2
//		} //send(String data)�޼ҵ� ��
//
//	} // ���� Client class
//
//	void startServer() {
//		executorService = Executors.newFixedThreadPool(10);
//		/*������ ���
//
//		1. ������ ������ �޼��� ���� �� 1��
//		
//		2. ������ ������ �ٸ� ����� �޼��� ���� �� 1�� 1��
//
//		2. ������ ���� �޼����� Ŭ���̾�Ʈ�鿡�� ���� �� 1�� send(String data)
//
//		3. ������ accept() �� �� 1��
//		
//		* 3�� �̻� ä���Ϸ��� ��� 5�� �̻��� �����尡 �ʿ��ϴ�.
//		*/
//
//		try {
//			serverSocket = new ServerSocket();
//			InetSocketAddress isa = new InetSocketAddress(hostIp, portNumber);
//			serverSocket.bind(isa);
//			Runnable runnable = new Runnable() {
//
//				@Override
//				public void run() {
//					Platform.runLater(() -> {
//						displayText("[��������]");
//					});
//
//					while (true) {
//						try {
//							Socket socket = serverSocket.accept();
//							String message = "���� ���� " + socket.getRemoteSocketAddress();
//							
//							Platform.runLater(() -> {
//								displayText(message);
//							});
//
//							Client client = new Client(socket);
//							connections.add(client);
//
//							Platform.runLater(() -> {
//								displayText("���� ����" + connections.size());
//							});
//
//						} catch (Exception e) {
//							if (!serverSocket.isClosed()) {
//								stopServer();
//								break;
//							}
//
//						}
//					}
//
//				}
//			};
//
//			executorService.submit(runnable); //3
//
//		} catch (Exception e) {
//			if (!serverSocket.isClosed()) {
//				stopServer();
//				return;
//			}
//		}
//
//	}//startServer() �޼ҵ�
//
//	void stopServer() {
//		try {
//			Iterator<Client> iterator = connections.iterator();
//			while (iterator.hasNext()) {
//				Client client = iterator.next();
//				client.socket.close();
//				iterator.remove();
//
//			}
//
//			if (serverSocket != null && !serverSocket.isClosed()) {
//				serverSocket.close();
//			}
//
//			if (executorService != null && !executorService.isShutdown()) {
//				executorService.shutdown();
//			}
//
//			Platform.runLater(() -> {
//				displayText("���� ����");
//				btnStartStop.setText("start");
//
//			});
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//
//	}//stopServer()�޼ҵ� ����
//
//	TextArea txtDisplay;
//	Button btnStartStop;
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		BorderPane root = new BorderPane();
//		root.setPrefSize(500, 300);
//
//		txtDisplay = new TextArea();
//		txtDisplay.setEditable(false);
//		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
//		root.setCenter(txtDisplay);
//
//		btnStartStop = new Button("start");
//		btnStartStop.setPrefHeight(30);
//		btnStartStop.setMaxWidth(Double.MAX_VALUE);
//
//		btnStartStop.setOnAction(e -> {
//			if (btnStartStop.getText().equals("start")) {
//				startServer();
//			} else {
//				stopServer();
//			}
//		});
//
//		root.setBottom(btnStartStop);
//
//		Scene scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("app.css").toString());
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("Server");
//		
//		primaryStage.setOnCloseRequest(e -> {
//			stopServer();
//			
//		});
//		primaryStage.show();
//
//	}
//
//	void displayText(String text) {
//		txtDisplay.appendText(text + "\n");
//	} //displayText(String text) �޼ҵ� ����
//
//	public static void main(String[] args) {
//		launch(args);
//
//	}

}
