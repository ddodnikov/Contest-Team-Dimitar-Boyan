package hw1s5;
import java.util.Scanner;

public class prblm16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short number;
		Scanner sc = new Scanner(System.in);
		System.out.print("number= ");
		number=sc.nextByte();
		if (number%10==(number/10)%10 && number/100==number%10)
			System.out.println("All digits are equal");
		else if (number/100>(number/10)%10 && (number/10)%10>number%10)
			System.out.println("The sequence formed by the digits is monotonic decreasing");
		else if (number/100<(number/10)%10 && (number/10)%10<number%10)
			System.out.println("The sequence formed by the digits is monotonic increasing");
		else
			System.out.println("The digits don't appear to be following any sort of rule");
	}

}
