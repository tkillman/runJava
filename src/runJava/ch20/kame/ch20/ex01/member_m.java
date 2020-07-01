package runJava.ch20.kame.ch20.ex01;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class member_m implements Externalizable{

	String name;
	String id;
	String pw;
	int age;
	boolean gender;
	
	public member_m(){}
	
	public member_m(String name, String id, String pw, int age, boolean gender){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.gender=gender;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeObject(id);
		out.writeObject(pw);
		out.writeObject(age);
		out.writeObject(gender);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String)in.readObject();
		id = (String)in.readObject();
		pw =(String)in.readObject();
		age =(int) in.readObject();
		gender =(boolean)in.readObject();
	}
	
	@Override
	public String toString() {
	
		StringBuffer result=new StringBuffer("[");
		
		result.append(name +" ");
		result.append(id +" ");
		result.append(pw+" ");
		result.append(age+" ");
		
		if(gender ==true){
		result.append("³²");
		}else{
			result.append("¿©");
		}
		result.append("]");
		
	return result.toString();
	
	}
	
	

}
