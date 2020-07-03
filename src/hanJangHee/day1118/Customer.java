package hanJangHee.day1118;

import java.io.*;

class Customer implements Serializable{

	private String name;
	
	public Customer(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String toString(){
		return "당신의 이름 : " + name;
	}
	
}