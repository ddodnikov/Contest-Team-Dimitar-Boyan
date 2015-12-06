package hw2s5;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
//				if (n-1+i*2 > 9)
//					break;
				System.out.print(n-1+i*2);
			}
			System.out.println();
		}
	}
// Rule seems to be to print a number with the same number of digits as "n" with the first iteration being "n-1" for a "n" number of times
// with each following iteration incrementing "n-1" by "+2". However no clear example is given on what happens if the rule can not be
// applied, such as when "n" is above "4", where "n" iterations and "n" number of digits are mutually exclusive. As a solution I have included
// a commented section, allowing the other variation I have foreseen as a possible requirement.
}
