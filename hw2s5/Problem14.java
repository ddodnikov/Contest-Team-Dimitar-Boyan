package hw2s5;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [10;200]\nn= ");
			n=sc.nextInt();
		} while (n<10 || n>200);
		for (int i=0;i<n;i++) {
			if ( (n-i)%7==0)
				System.out.println(n-i);
		}
	}

}
