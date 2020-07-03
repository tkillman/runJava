package hanJangHee.day1118;

import java.io.*;

class ExternalizableEx implements Externalizable{
	private String name;
	private int age;
	private int weight;
	
	public ExternalizableEx(){}
	
	public ExternalizableEx(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void writeExternal(ObjectOutput objOutput) throws IOException{
		objOutput.writeObject(name);
		objOutput.writeObject(new Integer(age));
	}
	
	public void readExternal(ObjectInput objInput) throws ClassNotFoundException, IOException{
		name = (String) objInput.readObject();
		age = ((Integer) objInput.readObject()).intValue();
	}
	
	public String toString(){
		return "name : " + name + " , age : " + age + " , weight : " + weight;
	}
	
	public static void main(String[] args){
		Externalizable ex1 = new ExternalizableEx("KH", 33, 70);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try{
			fos = new FileOutputStream("e:\\external.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ex1);
			fis = new FileInputStream("e:\\external.ser");
			ois = new ObjectInputStream(fis);
			
			Externalizable ex2 = (ExternalizableEx) ois.readObject();
			
			System.out.println("���� ��ü : " + ex1);
			System.out.println("������ ��ü : " + ex2);
				}catch(IOException ioe){
					ioe.printStackTrace();
			}catch(ClassNotFoundException cnfe){
				cnfe.printStackTrace();
		}finally{
			try{
				if(fis != null) fis.close();
				if(ois != null) ois.close();
				if(fos != null) fos.close();
				if(oos != null) oos.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
	

}
