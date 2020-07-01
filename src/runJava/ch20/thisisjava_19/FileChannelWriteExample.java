package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


// ** FileChannelWriteExample
// FileChannel의 정적 메소드인 open을 통해서 객체 생성 가능.
//파일에 데이터를 쓰는 write() 메소드 , int를 반환


public class FileChannelWriteExample {

	
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Temp/file.txt");
		Files.createDirectories(path.getParent());

		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		String data = "안녕하세요";

		Charset charset = Charset.defaultCharset(); //운영체제의 인코딩
		ByteBuffer byteBuffer = charset.encode(data);

		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt : " + byteCount + "bytes written");

		fileChannel.close();

	}

}
