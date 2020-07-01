package runJava.ch11.test;
import runJava.ch11.kame.ch11.ex02.Circle;
import runJava.ch11.kame.ch11.ex02.Rectangle;
import runJava.ch11.kame.ch11.ex02.Shape;
import runJava.ch11.kame.ch11.ex02.Triangle;


/**************instanceof ������******************
������? +,-,*,/ ������. �� �ǿ������� ���� ������ �򰡸� �����մϴ�. 
		
is a ����		
Circle is a Shape.

instanceof �����ڶ�

���� instanceof ������
������ ���۷��� ������ ������ Ŭ������ �ν��Ͻ��� ����ȯ�� �����Ѱ�?
boolean ���� ��ȯ		
*/

public class Ch11Ex04 {
	
	public static void polyMethod(Shape ref){ //polyMethod �޼ҵ� ���� , �Ű������� Shape ���۷��������� �޴´�.
		
		ref.area(); // �� �Լ��� ȣ��Ǹ� Shape Ŭ������ area �޼ҵ尡 ����ȴ�.
		
	if(ref instanceof Circle){ // ref ���۷��� ������ Circle Ŭ������ ���۷��� ������ ����ȯ�� �����Ѱ�?

		// c ���۷���������  ref�� ���۷��� ����ȯ�� �Ұ����ϱ� ������ �ֳ��ϸ� c�� ����Ŭ���� ref �� ����Ŭ�����̹Ƿ� 
		//���� ����ȯ (Circle)�� �־��ش�.
		Circle c = (Circle) ref; 
		System.out.println("��������"+ c.r +"���� ������" + c.res);
		
	}	else if (ref instanceof Rectangle){
		Rectangle r= (Rectangle) ref;
		System.out.println("�ʺ�"+ r.w +"���̰�" + r.h +"������"+r.res);

	} else if (ref instanceof Triangle){
		Triangle t= (Triangle)ref;
		System.out.println("�ʺ�"+ t.w +"���̰�" + t.h +"������" +t.res);
	}
} // polyMethod�� ��
	
	
	public static void main(String[] args) {
		polyMethod(new Circle()); // instanceof�� ����ؼ� � ������ ������ ���ϴ��� �� �� �ִ�.
		polyMethod(new Rectangle()); // 
		polyMethod(new Triangle());
	}
	}
