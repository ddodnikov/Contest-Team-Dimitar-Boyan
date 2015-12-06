package hw1s5;
import java.util.Scanner;

public class prblm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte hour;
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.print("hour= ");
		hour=sc.nextByte();
		if (hour>0 && hour<24)
			break;
		}
		if ( (hour>0 && hour<4) || hour>18)
			System.out.println("Good evening");
		if (hour>4 && hour<9)
			System.out.println("Good morning");
		if (hour>9 && hour<18)
			System.out.println("Good afternoon");
	}

}
