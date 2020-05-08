package basics;

public class SaleryCalculator {
	public static void main(String[] args) {
		String career;
		System.out.println("program is starting");
		career="software";
		System.out.println("My carrer is: " + career);
		
		int hoursPerWeek=40;
		int weeksPerYear=50;
		double rate=42.50;
		career="Web Developer";
		
		double salary= hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary at "+ career +"at the rate of "+rate+"is $"+salary);
		
	}
}
