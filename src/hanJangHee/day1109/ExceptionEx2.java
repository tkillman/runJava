package hanJangHee.day1109;

class ExceptionEx2 {

	public static void main(String[] args){
		try{
			int data = Integer.parseInt(args[0]);
			System.out.println( 50/data);
			
		
		}catch(NumberFormatException ne){
	    System.out.println("숫자를 입력하세요.");
	    }catch(ArithmeticException ae){
		System.out.println("0으로 나눌 수 없습니다.");
	    }catch(ArrayIndexOutOfBoundsException aie){
	    	
	    }catch(Exception e){
		System.out.println("예외처리");
	
	}
	}

}