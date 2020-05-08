package basics;

public class cities {
	public static void main(String[] args)
	{
		String[] cities= {"new york","san fransisco","miami"};
		System.out.println(cities[0]);
		
		String[] states= new String[5];
		states[0]="california";
		states[1]="2";
		states[2]="3";
		states[3]="4";
		states[4]="5";
		
		int i=0;
		do {
			System.out.println(states[i]);
			i=i+1;
		}while(i<5);
		
		i=0;
		while(i<5)
		{
			System.out.println(states[i]);
			i++;
		}
		
		String[] countries;
		countries= new String[2];
		countries[0]="usa";
		countries[1]="canada";
		System.out.println(countries[0]);

	}

}
