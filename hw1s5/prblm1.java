package hw1s5;
import java.util.Scanner;

public class prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a=sc.nextDouble();
		System.out.print("b= ");
		b=sc.nextDouble();
		System.out.print("c= ");
		c=sc.nextDouble();
		if ( (a<c || b<c) && (a>c || b>c) ) {
			if (a>b)
				System.out.println(c+" is in the scope of ("+b+","+a+")");
			else
				System.out.println(c+" is in the scope of ("+a+","+b+")");
		}
		else
			System.out.println(c+"is not within the scope of ("+(a>b?b:a)+","+(a>b?a:b)+")");
	}
}
