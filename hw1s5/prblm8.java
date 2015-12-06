package hw1s5;
import java.util.Scanner;

public class prblm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("a= ");
		a=sc.nextInt();
		b=(a/1000)*10+a%10;
		c=((a/100)%10)*10+((a/10)%10);
		if (b!=c)
			System.out.println(b+(b>c?" > ":" < ")+c );
		else
			System.out.println(b+" = "+c);
		
	}

}
