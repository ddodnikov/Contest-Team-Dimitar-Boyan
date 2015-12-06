package hw5s5;
import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input string:");
		String text = sc.nextLine();
		boolean isPalindrome=true;
		for (int index=0;index<text.length()/2;index++) {
			if (text.charAt(index)!=text.charAt(text.length()-1-index)) {
				System.out.println("The string is not a palindrome!");
				isPalindrome=false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The string is a palindrome!");
		}
	}

}
