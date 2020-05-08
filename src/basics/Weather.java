package basics;

public class Weather {
	public static void main(String[] args) {
		int temperture=65;
		String suncondition= "sunny";
		if(temperture > 80) {
			System.out.println("its pleasnt, wear short and t-shirt");
		}
		else if((temperture>60)&&(suncondition == "sunny")) {
			System.out.println("its alliter cooler. perhaps wera along shirt and jeans.");
			System.out.println("wear hat to keeep sun out of your eyes.");
		}
		else
		{
			System.out.println("looks like a cool day.");
		}
	}
}
