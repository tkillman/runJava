package runJava.ch08;


/*this를 사용하는 이유 : 필드 영역의 변수와 메소드의 매개변수가 동일한 이름을 가지고 있을 때 이를
				구분하기 위해서 자동적으로 생성된 래퍼런스 변수인 this를 사용하게 된다.
*/	
///     ******Ch08Ex01과 함께 볼 것...	


public class Point {
	
	int x;
	int y;
	public Point() {
		// TODO Auto-generated constructor stub
	}

	public Point(int new_x,int new_y){
		this.x= new_x;
		this.y= new_y;
		
	}
	
	public void setX(int x){
		this.x=x;
		//x=x; 이렇게 하게 되면 필드의 x값을 바꿀 수가 없다.
	}
	
	public void showPoint(){
		System.out.println("x좌표 :"+x+",y좌표 : "+y);
	}
	
	
	
}
