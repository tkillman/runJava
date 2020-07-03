package hanJangHee.day1110;

class Point implements Cloneable{
	int x;
	int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "x="+x+", y=" +y;
	}
	public Point clone(){       //오버라이딩
		Object obj = null;
		try{
			obj = super.clone();
			}catch(CloneNotSupportedException e){}
		return (Point)obj;
	}
}
class CloneEx1 {
	public static void main(String[]  args){
		Point original = new Point(3,5);
		Point copy = original.clone();
		System.out.println(original);
		System.out.println(copy);
	 original.x=10;
	 System.out.println(copy);
	}

}
