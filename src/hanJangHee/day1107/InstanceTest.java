package hanJangHee.day1107;

class InstanceTest {
	
	public static void main(String[] args){
		FireEngine fe = new FireEngine();
		Car c = new Car();
		
		if(c instanceof FireEngine){
			System.out.println("car -> FireEngine.");
		}
		
		if(fe instanceof FireEngine){
			System.out.println("This is a FireEngine instance.");
		}
		
		if (fe instanceof Car){
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object){
			System.out.println("This is an Object instance.");
		}
	}

}

class Car{}
class FireEngine extends Car{}

