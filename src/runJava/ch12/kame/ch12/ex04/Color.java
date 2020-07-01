package runJava.ch12.kame.ch12.ex04;
public interface Color {
	
	
	int RED=1; // public static final이 생략된 것. 상수로 인식
	int GREEN=2;
	int BLUE=3; 
	
	void setColor(int c); // public abstract가 생략됨.
	int getColor(); //추상 메소드로 인식
	

}
