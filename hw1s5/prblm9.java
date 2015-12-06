package hw1s5;
import java.util.Scanner;

public class prblm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		short a,b;
		System.out.print("a= ");
		a=sc.nextShort();
		System.out.print("b= ");
		b=sc.nextShort();
		System.out.println( a*b + ", " + (a*b)%10 + ( ((a*b)%10)%2==0?" even ":" odd "));
		
	}

}
