package hw2s5;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,rows=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number should be odd\nn= ");
		n=sc.nextInt();
		for (int i=0;i<n;i+=2) {
			rows++;
		}
		for (int i=1;i<=rows;i++) {
			for (int j=0;j<rows-i;j++) {
				System.out.print(" ");
			}
			for (int k=0;k<i*2-1;k++) {
//				if (i!=rows) {
//					if (k==0 || k==i*2-2) {
						System.out.print("*");
//						continue;
//					}
//				}
//				else {
//					System.out.print("*");
//					continue;
//				}
//				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
// commented lines of [21;31] excluding line 23 are the solution to the variation of this problem where we only want the contour displayed