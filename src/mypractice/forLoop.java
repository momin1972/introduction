package mypractice;

public class forLoop {


		int a;
		int b;
void add() {
	
int sum =(a+b);
System.out.println(sum);
}
	
int add(int a, int b, int c) {
	int sum = (a+b+c);
	return sum;
}
double add(double a, double b, double c) {
	double sum=(a+b+c);
	return sum;
}



	public static void main(String [] args){
		forLoop f = new forLoop();
		f.a=10;
		f.b=12;
		f.add();
		
	int sum =	f.add(10, 12, 21);
	System.out.println(sum);
	
	double sum1 =f.add(10.25, 12.25, 23.50);
	System.out.println(sum1);
	
	
}

}
