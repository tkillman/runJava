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
// FileChannel�� ���� �޼ҵ��� open�� ���ؼ� ��ü ���� ����.
//���Ͽ� �����͸� ���� write() �޼ҵ� , int�� ��ȯ


public class FileChannelWriteExample {

	
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Temp/file.txt");
		Files.createDirectories(path.getParent());

		FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		String data = "�ȳ��ϼ���";

		Charset charset = Charset.defaultCharset(); //�ü���� ���ڵ�
		ByteBuffer byteBuffer = charset.encode(data);

		int byteCount = fileChannel.write(byteBuffer);
		System.out.println("file.txt : " + byteCount + "bytes written");

		fileChannel.close();

	}

}
