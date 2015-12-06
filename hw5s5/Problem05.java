package hw5s5;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String first,second;
		int firstWordMatch=0,secondWordMatch=0;
		System.out.println("first word");
		first=sc.nextLine();
		System.out.println("second word");
		second=sc.nextLine();
		for (int index=0;index<first.length();index++) {
			for (int index2=0;index2<second.length();index2++) {
				if (first.charAt(index)==second.charAt(index2)) {
					firstWordMatch=index;
					secondWordMatch=index2;
					break;
				}
			}
			if (firstWordMatch!=0) {
				break;
			}
		}
		if (firstWordMatch!=0 && secondWordMatch!=0) {
			for (int index=0;index<first.length();index++) {
				if (index!=firstWordMatch) {
					for (int index2=0;index2<secondWordMatch;index2++) {
						System.out.print(" ");
					}
					System.out.println(first.charAt(index));
				}
				else {
					System.out.println(second);
				}
			}
		}
	}

}
