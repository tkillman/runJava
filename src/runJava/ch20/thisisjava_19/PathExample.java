package runJava.ch20.thisisjava_19;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/////***************** PathExample**********************//
// Path는 IO기반 File 클래스와 유사 , get()메소드를 통해 객체를 구할 수 있다.

public class PathExample {

	public static void main(String[] args) {

		Path path = Paths.get("src/ch20/thisisjava_19/PathExample.java");

		System.out.println("파일명 : " + path.getFileName());

		System.out.println("부모 디렉토리명 : " + path.getParent().getFileName());

		// 중첩 경로수 src 1 , ch20 2, thisisjava_19 3, PathExample.java 4
		System.out.println("중첩 경로수 : " + path.getNameCount());

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
