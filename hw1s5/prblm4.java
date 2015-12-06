package hw1s5;
import java.util.Scanner;

public class prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double a,b;
		System.out.print("a= ");
		a=sc.nextDouble();
		System.out.print("b= ");
		b=sc.nextDouble();
		if (a>b)
			System.out.println(a+" , "+b);
		else
			System.out.println(b+" , "+a);

	}

}
