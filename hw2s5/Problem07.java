package hw2s5;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print(3*i);
			if (i!=n)
				System.out.print(",");
		}
	}

}
