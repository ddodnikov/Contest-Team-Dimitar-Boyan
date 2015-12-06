package hw3s5;
import java.util.Scanner;

public class Problem17 {

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
		for (int i=1;i<n-1;i+=2) {
			if (array[i]>array[i-1] && array[i]>array[i+1]) {
				if ((n-1)-i<3) {
					System.out.println("\nThe array is jagged");
				}
				continue;
			}
			System.out.println("\nThe array is not jagged");
			break;
		}
	}

}
