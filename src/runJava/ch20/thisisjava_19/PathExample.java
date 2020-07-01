package runJava.ch20.thisisjava_19;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/////***************** PathExample**********************//
// Path�� IO��� File Ŭ������ ���� , get()�޼ҵ带 ���� ��ü�� ���� �� �ִ�.

public class PathExample {

	public static void main(String[] args) {

		Path path = Paths.get("src/ch20/thisisjava_19/PathExample.java");

		System.out.println("���ϸ� : " + path.getFileName());

		System.out.println("�θ� ���丮�� : " + path.getParent().getFileName());

		// ��ø ��μ� src 1 , ch20 2, thisisjava_19 3, PathExample.java 4
		System.out.println("��ø ��μ� : " + path.getNameCount());

		System.out.println("----------------------");

		for (int i = 0; i < path.getNameCount(); i++) {

			System.out.println(path.getName(i));
		}

		System.out.println("--------------------------");

		Iterator<Path> iterator = path.iterator();

		while (iterator.hasNext()) {

			Path temp = iterator.next();

			System.out.println(temp.getFileName());

		}

	}

}
