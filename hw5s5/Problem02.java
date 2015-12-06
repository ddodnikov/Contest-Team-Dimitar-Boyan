package hw5s5;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String first,second;
		do {
		System.out.println("first word, with [10,20] characters");
		first=sc.nextLine();
		System.out.println("word length:"+first.length());
		} while (first.length()<10 || first.length()>20);
		do {
		System.out.println("second word, with [10,20] characters");
		second=sc.nextLine();
		System.out.println("word length:"+second.length());
		} while (second.length()<10 || second.length()>20);
		
		first=(second.substring(0, 5)).concat(first.substring(5));
		second=(first.substring(0, 5)).concat(second.substring(5));
		// The example given in the homework is incorrect because it does not follow the rule of having [10,20] characters
		if (first.length()>=second.length()) {
		System.out.println(first);
		}
		else {
			System.out.println(second);
		}
	}

}
