package introduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//String is an object, that represent sequence of characters.
//there are two way to create String object:1. String literal 2. String new keyword
		
		//String s = "Mominul Mohammed Islam"; //String literal; so in 's' variable it will create one object
	//	String s1 = "Mominul Mohammed Islam";//in literal String if multiple String has same value or text it will create one object. 
		String s5 = "welcome";
		
		//String new keyword: Java will create different or each object.
		String s3 = new String ("Welcome");
		String s4 = new String ("Welcome");
		
		
		
		String s = "Mominul Mohammed Islam";
String [] splittedString =	s.split("Mohammed");//1st white space, 2nd Mohammed
System.out.println( splittedString [0]);
System.out.println( splittedString [1]);
//System.out.println( splittedString [2]);
System.out.println(splittedString[1].trim());
//for(int i=0; i<s.length(); i++) {
//System.out.println(s.charAt(i));
//}

for(int i = s.length()-1; i>0; i--) 
{
	System.out.println(s.charAt(i));
}

	

	}

}
