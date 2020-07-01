package runJava.ch20.kame.ch20.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

////************** 객체의 직렬화 **************///////
//DataOutputStream의 경우 데이터를 일렬로 내보내는 단점이 있다.
//이 데이터들을 한 곳에 모아서 객체화 시켜서 전송 ObjectOutputStream 형태 write 메소드

public class Ch20Ex09 {

	public static void main(String[] args) {
		String mem_name = null;
		String mem_id = null;
		String mem_pwd = null;
		boolean mem_gender = true;
		int mem_age = 0;
		String mem_phone = null;
		String temp = null;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		File f = new File("C:\\java_workspace\\Ch20\\mem3.dat");

		try {

			FileOutputStream fos = new FileOutputStream(f, true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			System.out.println("--회원정보 입력하기--");
			System.out.print("이름>>>>");
			mem_name = br.readLine();
			System.out.print("아이디>>>>");
			mem_id = br.readLine();
			System.out.print("비밀번호>>>>");
			mem_pwd = br.readLine();
			System.out.print("성별>>>>");
			temp = br.readLine();
			if (temp.equals("남자")) {
				mem_gender = true;
			} else {
				mem_gender = false;
			}

			System.out.print("나이>>>>");
			temp = br.readLine();
			mem_age = Integer.parseInt(temp);

			System.out.print("전화번호>>>>");
			mem_phone = br.readLine();

			oos.writeUTF(mem_name);
			oos.writeUTF(mem_id);
			oos.writeUTF(mem_pwd);
			oos.writeBoolean(mem_gender);
			oos.writeInt(mem_age);
			oos.writeUTF(mem_phone);
			oos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
