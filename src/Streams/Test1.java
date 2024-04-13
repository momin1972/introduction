package Streams;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void regular() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aiman");
		names.add("Rafan");
		names.add("Ghalib");
		names.add("Mehtab");
		names.add("Momin");
		names.add("Ayesha");
		int count = 0; //initially, I will set to count zero. let's assume that we do not have any name, starting with letter A, 
					 
		for(int i=0; i<names.size(); i++)
		{
		// get method in ArrayList used to pull the element which is present in the ArrayList.
			//whatever I get for each and every loop iteration, I will store in one String in "actual" variable/object
			String actual = names.get(i);
			//after you pull each and every item from that ArrayList, you should compare if that String start with letter 'A'.
			if (actual.startsWith("A"))
			{
				//but whenever it found some match, then it will increment this count.
				count++;
			}
		
		}
		System.out.println(count); //run with TestNG test
}
//@Test
//public void streamFilter()
//{
//	ArrayList<String> names = new ArrayList<String>();
//	names.add("Aiman");
//	names.add("Rafan");
//	names.add("Ghalib");
//	names.add("Mehtab");
//	names.add("Momin");
//	names.add("Ayesha");
	//assign or put the ArrayList to stream by using .(dot) stream first(stream in nothing but collection of strings) stream doing operation parallel 
	//then use filter method. filter is something which filter based on condition. This filter take argument Lambda Expression. it has variable in left 
	//side, like (s);every time valut will be stored in (s) variable then lambda evaluate action like Startwith"A".  This filter method scan all the name 
	//parallely and filter all name if any name messes with this filter like "A" then it will return true if not return false.
	//There is a one concept in Java called Lambda Expression. It is a arrow operation in Java. It is divided into two parts. Left side givens the parameter
	//and the right side gives action.
	
//	Long c = names.stream().filter(s->s.startsWith("A")).count(); //we put it in one variable (data type is Long that why Long)
//	System.out.println(c);
	
}

