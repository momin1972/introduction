package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
	
	int	mynum = 5;
		String website = "Rahul Shatty Academy";
	char	letter = 'r';
	double	dec = 5.99;
	boolean	myCard = true;
	
//System.out.println(mynum + "is value that stored in mynum");
//	System.out.println(website);
	
//Arrays -> arrays can store multiple values in single variabl
	
	int [] arr = new int[5];  //syntax of arrays 1st; static array
	//memory allocation is fixed in the beginning, later we can not increase the size.
	
	arr[0] = 1;
	arr [1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr [4] = 5;
	
	int[] arr2 = {1,2,4,5,6,7,99};  //syntax of arrays 2nd way
	
//System.out.println(arr2[2]);
	
	//for loop
//	for (int i = 0; i< arr.length; i++) 
//{	System.out.println(arr[i]);  //1st system

	//}
//	for(int i=0; i<arr2.length; i++) {
//		System.out.println(arr2[i]);  //2nd system
//		System.out.println(arr2[0]);
//	}
	String[] name = {"Mominul", "Mohammed", "Islam"};  //String for loop
	//for(int i=0; i<name.length;i++){
//	System.out.println(name[i]);
//	}
for (String s:name) {
		System.out.println(s);
	}
	}
}
	


