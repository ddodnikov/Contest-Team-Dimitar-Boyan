package hw2s5;
import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a=sc.nextInt();
		for (int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println("sum= "+sum);
	}

}
