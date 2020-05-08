package OOP;

public class OopTask {
	public static void main(String[] args)
	{
		System.out.println("hiiiiiiiii");
		CStudent s1=new CStudent("hadeel","123456789");
		s1.enroll("math");
		s1.enroll("eng");
		
		s1.showCourses();
		s1.checkBalance();
		s1.pay(400);
		s1.checkBalance();
		System.out.println(s1.toString());
		}

}

class CStudent
{
	private static int ID=1000;
	private String userId;
	private String phone;
	private String city;
	private String state;
	private String courses="";
	private int balance;
	private String name;
	private String SSN;
	private String email;
	private static final int costPerCourse=500;
	
	
	public CStudent(String name, String SSN) {
		ID++;
		this.name=name;
		this.SSN=SSN;
		setEmail();
		setUserId();
		this.balance=0;
		
	}
	
	private void setUserId() {
		int random= (int) (Math.random()*1000);
		if(random>9000)
			random=random%9000;
		userId= ID +""+ random +""+ SSN.substring(6);
		System.out.println("your user id:"+ userId);
	}

	private void setEmail() {
		this.email= name.toLowerCase() + "@gmail.com";
		System.out.println("your email:" + email);
	}

	public void enroll(String course)
	{
		this.courses+= course + " ";
		System.out.println("your courses: "+courses);
		balance+= costPerCourse;
	}
	
	public void pay(int amount) {
		this.balance-=amount;
	}



	public void checkBalance() {
		System.out.println("your balance: $"+balance);
	}
	
	public void showCourses()
	{
		System.out.println("your courses: "+  this.courses);
	}

	@Override
	public String toString()
	{
		return "[name= "+name+"]\n[courses= "+courses+"]\n[User ID is=  "+userId+"]\n";
	}
	
	
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	

}



