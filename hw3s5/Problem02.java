package hw3s5;
import java.util.Scanner;

public class Problem02 {

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
		int[] mirrorHalfArray = new int[n];
		for (int i=0;i<n/2+n%2;i++) {
			mirrorHalfArray[i]=array[i];
			mirrorHalfArray[n-1-i]=array[i];
		}
		for (int i=0;i<n;i++) {
			System.out.print(mirrorHalfArray[i]);
		}
	}

}
