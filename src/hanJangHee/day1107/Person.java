package hanJangHee.day1107;

class Person {

	private String name;
	private int age;
	
	Person(){}
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	

	public void print(){
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
	
}




class Student extends Person{
	private int id;
	
	public Student(String name, int age, int id){
	    super(name, age);
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	@Override
	public void print(){
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 학번 :" + id);
	}

}
	
	
class Teacher extends Person{

	private String subject;
	
	Teacher(String name, int age, String subject){
        super(name, age);
		this.subject=subject;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public void setId(String subject){
		this.subject=subject;
	}
	
	public void print(){
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 과목 :" + subject);
	}
	
}


class Employee extends Person{
	
	private String dept;
	
	Employee(String name, int age, String dept){
        super(name,age);
		this.dept=dept;
	}
	
	public String getDept(){
		return dept;
	}
	
	public void setDept(String dept){
		this.dept=dept;
	}
	
	public void print(){
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 부서 :" + dept);
	}
}




