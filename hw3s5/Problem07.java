package hw3s5;
import java.util.Scanner;

public class Problem07 {

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
		array2[0]=array[1];
		array2[n-1]=array[n-2];
		for (int i=1;i<n-1;i++) {
			array2[i]=array[i-1]+array[i+1];
		}
		for (int i=0;i<n;i++) {
			System.out.println("array2["+i+"]= "+array2[i]);
		}
	}

}
