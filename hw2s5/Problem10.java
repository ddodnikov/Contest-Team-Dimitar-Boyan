package hw2s5;
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		n=sc.nextInt();
		for (int i=2;i<=(int)Math.sqrt(n);i++) {
			if (n%i==0) {
				System.out.print("The number "+n+" is not primitive"); // 1369 = 37*37
			}
		}
	}

}
