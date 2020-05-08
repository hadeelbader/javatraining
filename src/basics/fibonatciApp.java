package basics;

public class fibonatciApp {
	public static void main(String[] args) {
		int n=10;
		int result=fib(n);
		System.out.println("the "+n +"th fibonatci number is "+result);
	}
	public static int fib(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
