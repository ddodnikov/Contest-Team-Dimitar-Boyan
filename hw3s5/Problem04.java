package hw3s5;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextInt();
		}
		for (int i=0;i<n/2;i++) {
			if (array[i]==array[n-1-i]) {
				if (i==n/2-1) {
					System.out.println("The array is mirrored.");
				}
			}
			else {
				System.out.println("The array is not mirrored.");
				break;
			}
		}
	}

}
