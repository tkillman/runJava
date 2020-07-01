package runJava.ch12.kame.ch12.ex02;

import runJava.ch12.kame.ch12.ex01.Shape;

//**********  추상 메소드 상속**********
//반드시 오버라이딩된 darw()라는 메소드를 정의해 주어야 한다.
// 그렇지 않으면 몸체가 없는 추상 메소드가 불려나갈 수 있으니까.
public class Circle extends Shape{ //추상 메소드를 상속함

	@Override
	
	public void draw(){
		
		System.out.println("원을 그리다.");
	}
	
	
}
