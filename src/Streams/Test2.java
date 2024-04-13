package Streams;

import java.util.ArrayList;

public class Test2 {

	public void regular() {
		ArrayList<String> a = new ArrayList<String>();	
		a.add("Mominul");
		a.add("Mohammed");
		a.add("Islam");
		a.add("Dhaka");
		int count =0;
		for(int i=0; i<a.size();i++) {
			String actual =a.get(i);
			if(actual.startsWith("M")) {
				
				count++;
			}
		}
	}
	

	
}
