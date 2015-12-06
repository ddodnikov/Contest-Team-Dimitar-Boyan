package hw2s5;
import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a=sc.nextInt();
		System.out.print("b= ");
		b=sc.nextInt();
		for (int i=a;i<=b;i++) {
			if (i%3==0) {
				System.out.print(" skip 3 ");
				continue;
			}
			System.out.print( (int)Math.pow(i, 2)+" ");
			sum+= Math.pow(i, 2);
			if (sum>200)
				break;
		}
	}

}
