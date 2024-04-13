package introduction;

public class MethodsDemo3 {

	public static void main(String[] args) {
	MethodsDemo3 md = new MethodsDemo3();
	String name =md.getData();
	System.out.println(name);
	getUserData();	
	}

	public String getData() {
		System.out.println("Hello world");
		return "momin";
	}
	public static void getUserData() {
		System.out.println("come back soon");
	}
	
}
