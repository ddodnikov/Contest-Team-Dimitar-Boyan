package hw3s5;
import java.util.Scanner;

public class Problem18 {

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
		int[] array2 = new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("array2["+i+"]= ");
			array2[i]=sc.nextInt();
		}
		int[] arrayMix = new int[n];
		for (int i=0;i<n;i++) {
			if (array[i]<array2[i]) {
				arrayMix[i]=array2[i];
			}
			else
				arrayMix[i]=array[i];
		}
		for (int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for (int i=0;i<n;i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		for (int i=0;i<n;i++) {
			System.out.print(arrayMix[i]+" ");
		}
	}

}
