package hanJangHee.day1103;

class PointTest extends Object{

	PointTest(){
		super();
	}
	public static void main(String[] args){
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}

class Point extends Object{
	int x;
	int y;
	
	Point(int x, int y){
		super(); //
		this.x=x;
		this.y=y;
	}
	
	String getLocation(){
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y); //
		/* this.x = x;
		this.y = y; */
		this.z = z;
		
	}
	String getLocation(){
		return "x :" + x + ", y : " + y + " ,z :" + z;
		
	}
}
