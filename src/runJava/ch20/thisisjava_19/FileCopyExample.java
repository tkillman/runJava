package runJava.ch20.thisisjava_19;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// ********* FileCopyExample ************

// Channel�� �ΰ� ���ÿ� ��� ���ʿ����� �Է¸� �ް� �ٸ� �ʿ����� ��¸� ����ϸ� ���簡 �ȴ�.


public class FileCopyExample {

	public static void main(String[] args) throws IOException {

		Path from = Paths.get("src/thisisjava_19/Koala.jpg");
		Path to = Paths.get("src/thisisjava_19/Koala2.jpg");

		FileChannel fileChannel_from = FileChannel.open(from, StandardOpenOption.READ);

		FileChannel fileChannel_to = FileChannel.open(to, StandardOpenOption.CREATE,StandardOpenOption.WRITE);

		ByteBuffer buffer = ByteBuffer.allocateDirect(100);
		int byteCount;

		while (true) {
			buffer.clear();
			byteCount = fileChannel_from.read(buffer);
			if (byteCount == -1) {
				break;
			}

			buffer.flip();

			fileChannel_to.write(buffer);

		}

		fileChannel_from.close();
		fileChannel_to.close();
		System.out.println("���� ���� ����");
		
	}

}
