package hw2s5;
import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,helper;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [10;99]\nn= ");
			n=sc.nextInt();
		} while (n<10 || n>99);
		helper=n;
		while (helper!=1) {
			if (helper%2==0) {
				System.out.print(helper/2+" ");
				helper=helper/2;
			}
			else {
				System.out.print(helper*3+1+" ");
				helper=helper*3+1;
			}
		}
	}

}
