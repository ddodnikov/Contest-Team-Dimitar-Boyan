package hw5s5;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useDelimiter("\\s|\\n");
		System.out.println("Input string:");
		String text;
		int max=0;
		int wordCounter=0;
		int symbolCounter=0;
		do {
			text = sc.next();
			wordCounter++;
			if (max<text.length()) {
				max=text.length();
			}
			System.out.println(symbolCounter);
		} while (text.length()>0);
		wordCounter--; 						// the do while cycle allows one more iteration than wanted and with sc.hasNext()
											// not working because of the System.in always returning true, I couldn't figure how to fix it
		System.out.println(wordCounter+" words with the longest one being "+max+" characters");
	}

}
