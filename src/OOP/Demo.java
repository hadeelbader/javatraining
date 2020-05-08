package OOP;

class person{
	String name;
	String email;
	String phone;
	
	void walk()
	{
		System.out.println(name+" is walking");
	}
	void eat()
	{
		System.out.println(email);
	}
	void sleep()
	{
		System.out.println(name+" is sleeping");
	}
}

public class Demo {
	public static void main(String[] args)
	{
		person p1= new person();
		p1.name="john";
		p1.email="john@gmail.com";
		p1.phone="0500000";
		p1.walk();
		p1.eat();
		p1.sleep();
		
		person p2= new person();
		p2.name="sara";
		p2.email="sara@gmail.com";
		p2.phone="0500000";
		p2.walk();
		p2.eat();
		p2.sleep();

	}
}

