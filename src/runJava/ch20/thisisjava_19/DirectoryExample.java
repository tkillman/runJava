package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


//************* DirectoryExample 
// 디렉토리와 파일을 생성하고 디렉토리의 내용을 출력하는 예제


public class DirectoryExample {

	public static void main(String[] args) {

		Path path1 = Paths.get("C:/Temp/dir/subdir");
		Path path2 = Paths.get("C:/Temp/file.txt");

		if (Files.notExists(path1)) {
			try {
				Files.createDirectories(path1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (Files.notExists(path2)) {

			try {
				Files.createFile(path2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		Path path3 = Paths.get("C:/temp");

		try {
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
			for (Path path : directoryStream) {
				if (Files.isDirectory(path)) {
					System.out.println("디렉토리 : " + path.getFileName());

				} else {
					System.out.println(" 파일 " + path.getFileName() + " , 크기 : " + Files.size(path));
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
