package hw3s5;
import java.util.Scanner;

public class Problem09 {

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
		// solution with an extra array
		/*
		int[] array2 = new int[n];
		for (int i=0;i<n;i++) {
			array2[i]=array[n-1-i];
			System.out.print("array2["+i+"]= "+array2[i]);
		}
		*/
		//solution without an extra array
		int helper;
		for (int i=0;i<n/2;i++) {
			helper=array[i];
			array[i]=array[n-1-i];
			array[n-1-i]=helper;
		}
		for (int i=0;i<n;i++) {
			System.out.println("array["+i+"]= "+array[i]);
		}
	}

}
