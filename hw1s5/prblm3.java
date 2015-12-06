package hw1s5;
import java.util.Scanner;

public class prblm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.print("a= ");
		a=sc.nextDouble();
		System.out.print("b= ");
		b=sc.nextDouble();
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a= "+a+" and b= "+b);
		
	}

}
