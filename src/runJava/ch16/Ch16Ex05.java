package runJava.ch16;

import java.util.Vector;


//////////////************** Vector 클래스*****************

public class Ch16Ex05 {
	
	public static void main(String[] args) {
		
		Vector<String> vec= new Vector<String>(4,3);
		// 최초 4로 생성하고 늘어나야 할 필요성이 생기면 최대치에 3만큼 더해서 늘어난다.
		
		
		System.out.println("벡터에 저장된 요소의 개수 :" + vec.size());
		System.out.println("벡터의 용량 :" + vec.capacity() +"\n");
		// 요소의 개수는 0개 ,최초 용량  4 
		
		vec.add("사과");
		vec.add("수박");
		vec.add("귤");
		vec.add("딸기");
		vec.add("수박");
		
		System.out.println(">>>get 메소드로 요소 얻기<<<<");
		for(int i=0; i<vec.size();i++){
			
			System.out.print(vec.get(i) +"\t");
		}	System.out.println("\n");
		
		System.out.println("벡터에 저장된 요소의 개수 :" + vec.size());
		System.out.println("벡터의 용량 :" + vec.capacity() +"\n");
		// 용량이 4였는데 5개의 요소가 들어오면서 벡터가 자동적으로 용량을 늘렸고 
		// 늘려야할 용량에서 3을 더한 만큼 늘려서 4+3 = 7 이 되었다.
		
		
		
		
		System.out.println(">>>Vector의 용량을 현재 크기로 줄임<<<<<<<<");
		vec.trimToSize();
		//용량을 현재치로 줄임.
		
		System.out.println("벡터에 저장된 요소의 개수 :" +vec.size());
		System.out.println("벡터의 용량 " +vec.capacity());
		
		
		
	}
}
