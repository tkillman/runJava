package hanJangHee.day1028;

class IfEx {

	public static void main(String[] args){
		
	// if(���ǽ�){���ǽ��� ����� true�� ��� ������ ���๮;}
    // ���๮�� �ϳ��� ���, ���� ���� �� �ִ�.
		
	/*	int su1 = 40;
		String str=""; //���ڿ��� �ʱ�ȭ
		
		if(su1 >= 50){
			str = "50�̻�";
			} else{
				str ="50�̸�";
			}
		
		System.out.println(str);
	
		
		
		int su1 = Integer.parseInt(args[0]);
		String str;
		
		if(su1>=41){str= "���";}
		else if(su1>=10){str="�߱�";}
		else{str="�ʱ�";}
		
		System.out.println(str);
		
		
		
		String data = args[0];
		String res;
		
		if(data.equals("����")){
			 res = "���ִ�.";
		} else if(data.equals("����")){
			res = "�ÿ��ϴ�.";
		} else if(data.equals("����")){
			res = "�޴�";
		} else{res="��Ÿ";
		}
		
		*/
		
		
		 int jumsu = Integer.parseInt(args[0]);
		 String res;
		 
		 if(jumsu >= 90 && jumsu <= 100){
			 res = "A";
		      if(jumsu<=93){res+="-";}
		      else if(jumsu>=98){res+="+";}
		     res+="����";
		 }
	
		
		 else if(jumsu >= 80 && jumsu <90){
			 res = "B����";}
		 else if(jumsu >=70 && jumsu <80){
			 res = "C����";}
		 else if(jumsu >=60 && jumsu <70){
			 res = "D����";}
		 else if(jumsu >=50 && jumsu <60){
			 res = "E����";}
		 else{
			 res = "�׾�� F";
		 }
		
		 System.out.println(res);
		 
		
		
		
		
		
	}
}
