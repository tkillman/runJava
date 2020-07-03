package hanJangHee.day1110;

class UserException extends Exception{
	
	private int port = 772;
	public UserException(String msg){
		super(msg);
	}
	public UserException(String msg, int port){
		super(msg);
		this.port= port;
	}
	public int getPort(){
		return port;
	}
}

class UserExceptionTest {
 
	public void test1(String[] n) throws UserException{
		System.out.println("Test1");
		if(n.length < 1)
			throw new UserException("아무것도 없다네");
		else
			throw new UserException("최종 예선", 703);
	}
	public static void main(String[] args){
		UserExceptionTest ut = new UserExceptionTest();
		try{
			ut.test1(args);
			}catch(UserException ue){
				//System.out.println(ue.getMessage());
			   ue.printStackTrace();
			}
	}
}
