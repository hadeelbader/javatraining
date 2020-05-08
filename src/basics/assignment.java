package basics;

public class assignment {
	public static void main(String[] args)
	{
		System.out.println("func sum of 10 res="+sum(10));
		System.out.println("func factorial of 10 res="+factorial(10));
		int[] array = {1,2,3,4,5};
		System.out.println("func minimom of array res="+ minimum(array,5));
		System.out.println("func average of array res="+ avrage(array,5));

	}
	
	public static int sum(int n)
	{
		int i,sum=0;
		for(i=0;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static int factorial(int n)
	{
		if(n==1 || n==0) return 1;
		return n*factorial(n-1);
	}
	
	public static int minimum(int[] array , int size)
	{
		int min=array[0];
		for(int i =1;i<size ;i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		return min;
	}
	
	public static int avrage(int[] array , int size)
	{
		int sum=0;
		for(int i =0;i<size ;i++)
		{
			sum+=array[i];
		}
		return sum/size;
	}
	

}
