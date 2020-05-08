package basics;

public class Strings {
	public static void main(String[] args) {
		String booktitle;
		String wordchoise="ring";
		booktitle="the lord pf the rings";
		if(booktitle.contains("wordchoise")) {
			System.out.println("book title contains the word" +wordchoise);
		}
		
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome"))
			System.out.println("the browser is chrome");
		
		String firstName="hadeel";
		String lastName="faris";
		String ssn="123456789";
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(ssn.substring(5));
	}

}
