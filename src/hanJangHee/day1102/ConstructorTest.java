package hanJangHee.day1102;

class Data1{
	Data1(){}  //�⺻ ������ �߰�
	int value;
}

class Data2{
	int value;
	Data2(int x){        //�Ű������� �ִ� ������
		value = x;
	}
}


class ConstructorTest {
	ConstructorTest(){}
public static void main(String[] args){
	Data1 d1 = new Data1();
	Data2 d2 = new Data2(10);
}
	
}
