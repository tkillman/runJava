package runJava.ch20.kame.ch20.ex01;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// ***** ��ü ������ ������ ���� Externalizable �������̽� implements �� Member Ŭ����
//*** serialzable �� uid��? readObject�� ��ü�� Object���·� �ٽúҷ��� ���
// ���� Ŭ�������� �ҷ��� ������ ���� �� ���̰� ǥ�õǾ� �ִ�. �׷��� Ŭ������ ���� �߰��� ��� Ŭ������ uid���� ����Ǿ
// �θ����� ���� �ȴ�. �̷����� Ŭ������ uid�� ��������� ǥ���ؼ� ���� Ŭ������ ��ü���� ������ش�.


public class Member implements Externalizable {

	String mem_name = null;
	String mem_id = null;
	String mem_pwd = null;
	boolean mem_gender = true;
	int mem_age = 0;
	String mem_phone = null;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(mem_name);
		out.writeObject(mem_id);
		out.writeObject(mem_pwd);
		out.writeObject(mem_gender);
		out.writeObject(mem_age);
		out.writeObject(mem_phone);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		mem_name = (String) in.readObject();
		mem_id = (String) in.readObject();
		mem_pwd = (String) in.readObject();
		mem_gender = (boolean) in.readObject();
		mem_age = (int) in.readObject();
		mem_phone = (String) in.readObject();

	}

	public Member() {

	}

	public Member(String mem_name, String mem_id, String mem_pwd, boolean mem_gender, int mem_age, String mem_phone) {
		
		this.mem_name = mem_name;
		this.mem_id = mem_id;
		this.mem_pwd = mem_pwd;
		this.mem_gender = mem_gender;
		this.mem_age = mem_age;
		this.mem_phone = mem_phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		String temp;
		temp = mem_name + "\t" + mem_id + "\t" + mem_pwd + "\t";
		if (mem_gender == true) {
			temp += "����";
		} else {
			temp += "����";
		}
		temp += "\t" + mem_age + "\t" + mem_phone;
		return temp;
	}

}
