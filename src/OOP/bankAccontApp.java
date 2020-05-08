package OOP;



public class bankAccontApp {
	public static void main(String[] args)
	{
		bankAccount acc1= new bankAccount();
		bankAccount acc2= new bankAccount("checking account");
		acc1.name="hadeel";

		acc1.accountNumber="0001";
		acc2.accountNumber="0001";
		acc1.arroundingNumber="123";
		acc2.arroundingNumber="456";

		acc1.printArroundingNumber();
		acc2.printArroundingNumber();
		
		System.out.println(acc1.toString());
	}

}
