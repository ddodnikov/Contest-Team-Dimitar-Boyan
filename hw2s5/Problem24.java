package hw2s5;
import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,counter=0,i=-1;
		boolean flag=false;
		int[] number = new int[5];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [10;30 000]\nx= ");
			x=sc.nextInt();
		} while (x<10 || x>30000);
		do  {
			number[counter]=x%10;
			if (counter!=4)
				counter++;
			x/=10;
		} while (x!=0);
				do {
					if (i>=counter) {
						flag=true;
						break;
					}
					i++;
				} while (number[i]==number[counter-i]);
				if (flag==true)
					System.out.println("It's a palindrome");
				else
					System.out.println("It's not a palindrome");
	}
}
