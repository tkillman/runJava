package hanJangHee.day1110;

class EqualsEx1 {
	
	public static void main(String[] args){
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)){
			System.out.println("v1�� v2�� �����ϴ�.");
		}else{
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)){
			System.out.println("v1�� v2�� �����ϴ�.");
		}else{
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
	}

}

class Value extends Object{
	
	int value;
	
	Value(int value){
	this.value=value;
}
	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Value){
			return value == ((Value)obj).value;
		}else{
			return false;
		}
	}
}
