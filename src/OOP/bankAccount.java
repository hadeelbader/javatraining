package OOP;

public class bankAccount implements IRate  {
	String accountNumber;
	static String arroundingNumber;
	String name;
	String ssn;
	
	
	bankAccount()
	{
		System.out.println("new account created");
	}
	
	bankAccount(String accountType)
	{
		System.out.println("new account with type "+ accountType);

	}
	
	//interface methods

	public void setRate()
	{
		System.out.println("setting rate");
	}
	public void increaseRate()
	{
		System.out.println("increasing rate");
	}
		
	public void printArroundingNumber()
	{
		System.out.println("Arrounding number= "+arroundingNumber);
	}
	public void deposit()
	{
		
	}
	
	public void withDrow()
	{
		
	}
	
	public void checkBalance()
	{
		
	}
	
	public void getStatus()
	{
		
	}
	
	@Override
	public String toString()
	{
		return "[" +name+ " " +accountNumber +" arroundingNumber= "+ arroundingNumber +"]";
	}
}
