package hw5s5;
import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("text string:");
		text=sc.nextLine();
		char[] textCharArray = new char[text.length()];
		textCharArray=text.toCharArray();
		for (int index=0;index<textCharArray.length;index++) {
			if (textCharArray[index]==' ') {
				textCharArray[index+1]-=32;
			}
		}
		textCharArray[0]-=32;
		text=String.valueOf(textCharArray);
		System.out.println(text);
		// despite the recommendation to not use .toCharArray() , I assumed this use is preferred over the mutation of a string in loop
		// whether that is by the .replaceAll method or some other way. StringBuilder hasn't been taught to us yet and using an array
		// of strings and .split seemed like an unnecessarily complex solution to me given how simple the code above is.
	}

}
