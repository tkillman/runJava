package runJava.ch18.ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



///////************ ActionListener *****************
/*1.�̺�Ʈ ������ Ŭ������ ����
�߻� �޼��带 �������̵�

2.�̺�Ʈ ������ ��ü�� ����

3.�̺�Ʈ �ҽ��� �̺�Ʈ ������ ��ü�� ����Ѵ�.(�̺�Ʈ �ҽ� == ������Ʈ)*/

public class BtnHandler implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println("��ư�� Ŭ����");
	}

}
