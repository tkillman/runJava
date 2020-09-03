package runJava.ch20.thisisjava_19;

import java.awt.TextArea;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

//**************** WathchServiceExample*****************
// WatchService �������̽��� newWatchService()�޼ҵ带 ���� ������ü�� ���� �� �ִ�.


public class WatchServiceExample {
	
}

//public class WatchServiceExample extends Application {
//
//	class WatchServiceThread extends Thread {
//		@Override
//		public void run() {
//
//			try {
//
//				WatchService watchService = FileSystems.getDefault().newWatchService();
//				Path directory = Paths.get("C:/Temp");
//				directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
//						StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
//
//				while (true) {
//					WatchKey watchKey = watchService.take(); //���ŷ �޼ҵ�
//					List<WatchEvent<?>> list = watchKey.pollEvents();
//
//					for (WatchEvent watchEvent : list) {
//
//						// �̺�Ʈ ���� ���
//						Kind kind = watchEvent.kind();
//
//						// ������ Path ���
//						Path path = (Path) watchEvent.context();
//
//						if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
//
//							Platform.runLater(() ->
//
//							textArea.appendText("���� ���� �� -> " + path.getFileName() + "\n")
//
//							);
//
//						} else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
//
//							Platform.runLater(() ->
//
//							textArea.appendText("���� ���� �� -> " + path.getFileName() + "\n")
//
//							);
//
//						} else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
//
//							Platform.runLater(() ->
//
//							textArea.appendText("���� ������ -> " + path.getFileName() + "\n")
//
//							);
//
//						} else if (kind == StandardWatchEventKinds.OVERFLOW) {
//						}
//
//					} // for each�� ����
//
//					boolean valid = watchKey.reset();
//					if (!valid) {
//						break;
//					}
//
//				} // ���� ����
//
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//
//		}
//	}
//
//	TextArea textArea;
//
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		// TODO Auto-generated method stub
//		BorderPane root = new BorderPane();
//		root.setPrefSize(500, 300);
//
//		textArea = new TextArea();
//		textArea.setEditable(false);
//		root.setCenter(textArea);
//
//		Scene scene = new Scene(root);
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("WatchServiceExample");
//		primaryStage.show();
//		
//		WatchServiceThread wst = new WatchServiceThread();
//		wst.start();
//
//	} // start �޼ҵ� ����
//
//	public static void main(String[] args) {
//
//		launch(args);
//
//	} // ���� �޼ҵ� ����

//}
