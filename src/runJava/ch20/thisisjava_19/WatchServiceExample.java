package runJava.ch20.thisisjava_19;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//**************** WathchServiceExample*****************
// WatchService 인터페이스는 newWatchService()메소드를 통해 구현객체를 얻을 수 있다.




public class WatchServiceExample extends Application {

	class WatchServiceThread extends Thread {
		@Override
		public void run() {

			try {

				WatchService watchService = FileSystems.getDefault().newWatchService();
				Path directory = Paths.get("C:/Temp");
				directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
						StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

				while (true) {
					WatchKey watchKey = watchService.take(); //블로킹 메소드
					List<WatchEvent<?>> list = watchKey.pollEvents();

					for (WatchEvent watchEvent : list) {

						// 이벤트 종류 얻기
						Kind kind = watchEvent.kind();

						// 감지된 Path 얻기
						Path path = (Path) watchEvent.context();

						if (kind == StandardWatchEventKinds.ENTRY_CREATE) {

							Platform.runLater(() ->

							textArea.appendText("파일 생성 됨 -> " + path.getFileName() + "\n")

							);

						} else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {

							Platform.runLater(() ->

							textArea.appendText("파일 삭제 됨 -> " + path.getFileName() + "\n")

							);

						} else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {

							Platform.runLater(() ->

							textArea.appendText("파일 수정됨 -> " + path.getFileName() + "\n")

							);

						} else if (kind == StandardWatchEventKinds.OVERFLOW) {
						}

					} // for each문 종료

					boolean valid = watchKey.reset();
					if (!valid) {
						break;
					}

				} // 무한 루프

			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	TextArea textArea;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		textArea = new TextArea();
		textArea.setEditable(false);
		root.setCenter(textArea);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("WatchServiceExample");
		primaryStage.show();
		
		WatchServiceThread wst = new WatchServiceThread();
		wst.start();

	} // start 메소드 종료

	public static void main(String[] args) {

		launch(args);

	} // 메인 메소드 종료

}
