package hanJangHee.day1107;

public class School {

	public static void main(String[] args){
		
		Person s = new Student("ȫ�浿�л�",24,25000);
		Person t = new Teacher("ȫ���ڰ���",30,"�ڹ�");
		Person e = new Employee("��浿������",40,"������");
		
   s.print();
   t.print();
   e.print();
}
}
