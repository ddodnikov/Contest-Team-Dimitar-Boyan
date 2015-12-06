package hw2s5;
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sum=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		n=sc.nextInt();
		do {
			sum+=i;
			i++;
		} while (i<=n);
		System.out.println("sum= "+sum);
	}

}
