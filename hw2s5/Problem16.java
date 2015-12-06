package hw2s5;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [10;5555]\nn= ");
			n=sc.nextInt();
		} while (n<10 || n>5555);
		do {
			System.out.print("Input an integer in the scope of [10;5555]\nm= ");
			m=sc.nextInt();
		} while (m<10 || m>5555);
		for (int i=0;i<50;i++) {
			if ( (m-i)%50==0) {
				for (int j=0;j<(m-n)/50;j++) {
					if (j==m-i-j*50) {
						System.out.print(50);
						break;
					}
					System.out.print(m-i-j*50+", ");
				}
			}
		}
	}

}
