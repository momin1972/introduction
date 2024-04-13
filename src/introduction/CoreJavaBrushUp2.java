package introduction;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		int[] arr2 = {1,2,4,5,6,7,99};
		for(int i=0; i<arr2.length; i++) {
			
		
		
if (arr2 [i] % 2==0)
{
	System.out.println(arr2[i]);
	break;
	//break; //break only use to checked array is divided of 2
}
else
System.out.println(arr2[i] +"is not devided of 2");
	}
		ArrayList<String> a = new ArrayList<String>(); //ArrayList is one of the class in Java
		a.add("Mominul");
		a.add("Mohammed");
		a.add("Islam");
		a.add("Bangla");
		
	System.out.println (a.get(1)); //extract or call index
		// is a class; dynamically grow
		//to access any methods present in the class; we need to create object of the class
		//we can access the methods of the class by calling Object.method 
	for(int i=0; i<a.size(); i++)
	{
		System.out.println(a.get(i));
		System.out.println("*******");
		
for(String val :a) //enhance for loop: first write ArrayList on the right side (a) then : what are extracting from ArrayList (if string write 
		//string or int) so here it will extracting string so on the left we write String then veriable name like val
	{
		
	System.out.println(val);
	}
	System.out.println(a.contains("Islam")); //to check any specific item or data is present or not.
	}
	}
	}
