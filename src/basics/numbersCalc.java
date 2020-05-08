package basics;

public class numbersCalc {
	public static void main(String[] args) {
		System.out.println("program is starting");
		printName();
		int numa=10;
		int numb=20;
		addNumbers(numa,numb);
		int res= multiplyNumbers(numa,numb);
		System.out.println("result a*b =" + res);
	}
	static void printName(){
		System.out.println("my name is hadeel");
	}
	
	static void addNumbers(int a, int b) {
		int sum= a+b;
		System.out.println("sum of a+b ="+ sum);
	}
	
	static int multiplyNumbers(int a, int b) {
		addNumbers(5,4);
		return a*b;
	}
	

}
