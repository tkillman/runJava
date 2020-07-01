package runJava.ch12.kame.ch12.ex04;

//********** 인터페이스*************//
//1. 인터페이스 내에 메소드는 public abstract 가 생략 된 것으로 인식. 
//   모든 메소드는 디폴트로 추상 메소드로 인식한다.

//2. 인터페이스 내에 변수는 static final이 생략된 것으로 인식한다.
//   인터페이스 내의 모든 변수는 상수로 인식한다.



public interface Drawable {//interface Drawable 생성

	public abstract void draw(); // interface에는 추상 메소드만이 올 수 있다.

}
