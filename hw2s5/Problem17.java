package hw2s5;
import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b;
		char symbol;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [3;20]\nb= ");
			b=sc.nextInt();
		} while (b<3 || b>20);
		System.out.print("Choose a symbol to fill the square with: ");
		symbol=sc.next().charAt(0);
		for (int i=0;i<b;i++) {
			System.out.print("*");
			for (int j=0;j<b-1;j++) {
				if (i==0 || i==b-1)
					System.out.print("*");
				else
					System.out.print(symbol);
				if (j==b-2)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
