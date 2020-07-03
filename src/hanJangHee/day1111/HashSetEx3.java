package hanJangHee.day1111;

import java.util.HashSet;

class HashSetEx3 {

	public static void main(String[] args){
		HashSet<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person1("David", 10));
		set.add(new Person1("David", 10));
		System.out.println(set);
	}
}

class Person1{
	String name;
	int age;
	
	Person1(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Person1){
			Person1 tmp = (Person1)obj;
			return name.equals(tmp.name) && age ==tmp.age;
		}
		
		return false;
	}

	public int hashCode(){
		System.out.println(" hashCode()½ÇÇà");
		return name.hashCode() + age;
	}
	
	public String toString(){
		return name + ":" + age;
	}
}
