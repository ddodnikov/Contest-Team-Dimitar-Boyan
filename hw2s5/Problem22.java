package hw2s5;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,counter=1;
		String[][] deck = new String[13][4];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [1;999]\nn= ");
			n=sc.nextInt();
		} while (n<1 || n>999);
		while (counter<11) {
			n++;
			if (n%2==0) {
				System.out.println(counter+":"+n);
				counter++;
			}
			else if (n%3==0) {
				System.out.println(counter+":"+n);
				counter++;
			}
			else if (n%5==0) {
				System.out.println(counter+":"+n);
				counter++;
			}
		}
	}

}
