package runJava.ch20.kame.ch20.ex01;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

////************** ��ü�� ����ȭ **************///////
//DataOutputStream�� ��� �����͸� �Ϸķ� �������� ������ �ִ�.
//�� �����͵��� �� ���� ��Ƽ� ��üȭ ���Ѽ� ���� ObjectOutputStream ���� write �޼ҵ�

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

			System.out.println("--ȸ������ �Է��ϱ�--");
			System.out.print("�̸�>>>>");
			mem_name = br.readLine();
			System.out.print("���̵�>>>>");
			mem_id = br.readLine();
			System.out.print("��й�ȣ>>>>");
			mem_pwd = br.readLine();
			System.out.print("����>>>>");
			temp = br.readLine();
			if (temp.equals("����")) {
				mem_gender = true;
			} else {
				mem_gender = false;
			}

			System.out.print("����>>>>");
			temp = br.readLine();
			mem_age = Integer.parseInt(temp);

			System.out.print("��ȭ��ȣ>>>>");
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
