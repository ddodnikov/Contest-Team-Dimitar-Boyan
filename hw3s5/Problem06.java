package hw3s5;
import java.util.Scanner;

public class Problem06 {

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
		System.out.print("m= ");
		int m = sc.nextInt();
		int[] array2 = new int[n];
		for (int i=0;i<m;i++) {
			System.out.print("array2["+i+"]= ");
			array2[i]=sc.nextInt();
		}
		System.out.println("The array sizes are "+m+" and "+n);
		if (m!=n) {
			System.out.println("Their sizes are clearly different, as such the arrays are different as well");
		}
		else {
			for (int i=0;i<n;i++) {
				if (array[i]!=array2[i]) {
					System.out.println("The arrays are different");
					break;
				}
				if (i==n-1) {
				System.out.println("The arrays are the same.");
				}
			}
		}
	}

}
