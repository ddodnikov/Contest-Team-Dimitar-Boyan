package hw5s5;
import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String first,second;
		do {
		System.out.println("first string, without intervals");
		first=sc.nextLine();
		} while (first.contains(" ")==true);
		do {
		System.out.println("second string, without intervals");
		second=sc.nextLine();
		} while (second.contains(" ")==true);
		
		if (first.length()>second.length()) {
			System.out.println("first string is longer than the second");
			if (first.compareTo(second)!=0) {
				for (int index=0;index<first.length();index++) {
					if (first.charAt(index)!=second.charAt(index)) {
						System.out.println("difference at character "+(index+1)+" "+first.charAt(index)+"-"+second.charAt(index));
					}
				}
			}
		}
		else if (first.length()<second.length()) {
			System.out.println("second string is longer than the first");
			if (first.compareTo(second)!=0) {
				for (int index=0;index<first.length();index++) {
					if (first.charAt(index)!=second.charAt(index)) {
						System.out.println("difference at character "+(index+1)+" "+first.charAt(index)+"-"+second.charAt(index));
					}
				}
			}
		}
		else {
			System.out.println("The strings have equal length");
			if (first.compareTo(second)!=0) {
				for (int index=0;index<first.length();index++) {
					if (first.charAt(index)!=second.charAt(index)) {
						System.out.println("difference at character "+(index+1)+" "+first.charAt(index)+"-"+second.charAt(index));
					}
				}
			}
		}
	}

}
