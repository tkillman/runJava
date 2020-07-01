package runJava.ch18.ex02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



///////************ ActionListener *****************
/*1.이벤트 리스너 클래스를 설계
추상 메서드를 오버라이딩

2.이벤트 리스너 객체를 생성

3.이벤트 소스에 이벤트 리스너 객체를 등록한다.(이벤트 소스 == 컴포넌트)*/

public class BtnHandler implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println("버튼이 클릭됨");
	}

}
