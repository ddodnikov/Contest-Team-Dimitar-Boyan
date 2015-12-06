package hw2s5;
import java.util.Scanner;

public class Problem25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,counter=1,product=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		n=sc.nextInt();
		do {
			product*=counter;
			counter++;
		} while (counter!=n+1);
		System.out.println(product);
	}

}
