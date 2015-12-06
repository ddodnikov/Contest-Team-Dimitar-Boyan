package hw2s5;
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [1;9]\nn= ");
			n=sc.nextInt();
		} while (n<1 || n>9);
		do {
			System.out.print("Input an integer in the scope of [1;9]\nm= ");
			m=sc.nextInt();
		} while (m<1 || m>9);
		for (int i=1;i<=(n>m?n:m);i++) {				// I hope the convention of using the ternary operator ?: allows me to use
			for (int j=1;j<=(n>m?n:m);j++) {			// it like this, please insert feedback if not.
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
