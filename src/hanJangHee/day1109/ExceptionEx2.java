package hanJangHee.day1109;

class ExceptionEx2 {

	public static void main(String[] args){
		try{
			int data = Integer.parseInt(args[0]);
			System.out.println( 50/data);
			
		
		}catch(NumberFormatException ne){
	    System.out.println("���ڸ� �Է��ϼ���.");
	    }catch(ArithmeticException ae){
		System.out.println("0���� ���� �� �����ϴ�.");
	    }catch(ArrayIndexOutOfBoundsException aie){
	    	
	    }catch(Exception e){
		System.out.println("����ó��");
	
	}
	}

}