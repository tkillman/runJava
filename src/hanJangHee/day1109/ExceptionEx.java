package hanJangHee.day1109;

class ExceptionEx {
	
	public static void main(String[] args){
		int [] i = {10, 20, 30};
		
		for(int j = 0 ; j <=i.length; j++){
			try{
				System.out.println((j+1)+"��° ����"); //4
				System.out.println(i[j]);  //4
				System.out.println((j+1)+"~~~~~"); //3
			}catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("�ε����� ���� �ʽ��ϴ�."); //1
			    //System.out.println(ae.getMessage());
			    //ae.printStackTrace();
			}finally{
				System.out.println((j+1)+" finally");
			}
		}
		System.out.println("program END!!");
	}

}
