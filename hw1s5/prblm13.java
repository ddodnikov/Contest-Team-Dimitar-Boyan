package hw1s5;
import java.util.Scanner;

public class prblm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		byte temperature;
		System.out.print("temperature= ");
		temperature=sc.nextByte();
		if (temperature<-20)
			System.out.println("Ice ice baby");
		else if (temperature>-20 && temperature<0)
			System.out.println("Sure is frosty outside");
		else if (temperature>0 && temperature<15)
			System.out.println("The air outside is lukewarm");
		else if (temperature>15 && temperature<25)
			System.out.println("Feels nice outside");
		else if (temperature>25)
			System.out.println("Hot Hot Hot"); // by Arrow
	}

}
