package hw5s5;
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string:");
		String text = sc.nextLine();
		for (int index=0;index<text.length();index++) {
			System.out.print((char)(text.charAt(index)+5));
		}
	}

}
