package hanJangHee.day1104;

final class Singleton{
	
	int x;
	private static Singleton s = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(s==null){
			s=new Singleton();
		}
		return s;
	}
	
}

class SingletonTest {
        public static void main(String[] args){
       //	Singleton s = new Singleton();
        	Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            
            s1.x = 10;
            System.out.println(s1.x);
            System.out.println(s2.x);
        }
}
