package methodoverriding;

public class Test {

	public static void main(String[] args) {

		Teacher t1= new Teacher();
		t1.name="Momin";
		t1.age=50;
		t1.qualification = "M.Com";
		t1.displayInformation();

		Teacher t2= new Teacher();
		t2.name="Ghalib";
		t2.age=17;
		t2.qualification = "highschool";
		t2.displayInformation();
	}

}


//Teacher t1 = new Teacher();
//t1.age = 25;
//t1.name = "Momin";
//t1.qualification = "Bachelor";
//
//t1.displayInformation();
