package hanJangHee.day1109;

class ThrowEx2 {
	
	public void setData(String n) throws Exception {
		if(n.length() >= 1) {
			String str = n.substring(0, 1);
			printData(str);
		}
	}
	
	private void printData(String n) throws NumberFormatException{
		int dan = Integer.parseInt(n);
		System.out.println(dan+"��"); System.out.println("-----");
		for(int i = 0 ; i < 9 ; i++)
			System.out.println(dan + "*" + (i + 1) + "=" + (dan * (i + 1)));
	}
	public static void main(String[] args){
		ThrowEx2 t1 = new ThrowEx2();
		try{
			t1.setData(args[0]);
		}catch(Exception e){
			System.out.println("ù���ڰ� ���ڰ� �ƴմϴ�.");
			e.printStackTrace();
		}
	}

}
