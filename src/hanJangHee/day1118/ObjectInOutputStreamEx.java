package hanJangHee.day1118;

import java.io.*;

class ObjectInOutputStreamEx {
		
		public static void main(String[] args){
			ObjectInputStream ois = null;
			ObjectOutputStream oos = null;
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try{
				fos = new FileOutputStream("e:\\object.ser");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(new Customer("�̸�"));
				fis = new FileInputStream("e:\\object.ser");
				ois = new ObjectInputStream(fis);
				Customer m = (Customer)ois.readObject();
				System.out.println(m);
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