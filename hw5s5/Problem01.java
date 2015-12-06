package hw5s5;
import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String first,second;
		do {
		System.out.println("first string, no longer than 40 characters:");
		first=sc.nextLine();
		} while (first.length()>40);
		do {
		System.out.println("second string, no longer than 40 characters:");
		second=sc.nextLine();
		} while (second.length()>40);
		
		System.out.println(first.toUpperCase()+" "+first.toLowerCase());
		System.out.println(second.toUpperCase()+" "+second.toLowerCase());
	}
}
