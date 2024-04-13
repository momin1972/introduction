package introduction;

public class MethodsDemo {

	public static void main(String[] args) {
		//we should not create methods inside this main block; this for execution
		MethodsDemo d = new MethodsDemo();
		String name=d.getData(); //"Mominul Islam" now fall one veriable that is name
	System.out.println(name);
	getData2();
	MethodsDemo2 d1 = new MethodsDemo2();
	d1.getUserData();
}
	public String getData()	//when some lines of code can be reused many places that time we need create method
	{						//we do not run method this block but we can be run on demand
		
		System.out.println("hello world");
		return "Mominul Islam";
	}

	
		public static String getData2() 
		{
			System.out.println("hello world");
			return "Mominul Islam";
			
		}
	
}

