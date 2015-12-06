package hw1s5;
import java.util.Scanner;

public class prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.print("a= ");
		a=sc.nextDouble();
		System.out.print("b= ");
		b=sc.nextDouble();
		System.out.print("c= ");
		c=sc.nextDouble();
		if (a>b) {
			if (c>b)
				System.out.println( (a>c?a:c)+" , "+ (a>c?c:a)+" , "+b);
			else
				System.out.println(a+" , "+b+" , "+c);
		}
		else if (a==b)
			if (a>c)
				System.out.println(a+" , "+b+" , "+c);
			else
				System.out.println(c+" , "+b+" , "+a);
		else
			if (c>a)
				System.out.println(b>c?b:c+" , "+ (b>c?c:b)+" , "+a);
	}

}
