package Encapsulation;

public class TestEncap {

	public static void main(String[] args) {
	person p1 = new person();
//	p1.name ="Momin";
//	p1.age =50;
//	p1.display();
	
	p1.setName("Momin");
	p1.setAge(50);
	System.out.println(p1.getAge());
System.out.println(p1.getName());

	}

}
