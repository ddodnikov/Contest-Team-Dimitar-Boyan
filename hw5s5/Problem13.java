package hw5s5;
import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {

	static int[] problemSolver(int[] array1, int[] array2) {
		int[] concatenatedArrays = new int[array1.length+array2.length];
		for (int index=0;index<array1.length;index++) {
			concatenatedArrays[index]=array1[index];
		}
		for (int index=0;index<array2.length;index++) {
			concatenatedArrays[array1.length+index]=array2[index];
		}
		
		return concatenatedArrays;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		System.out.print("m= ");
		int m = sc.nextInt();
		int[] firstArray = new int[n];
		int[] secondArray = new int[m];
		for (int index=0;index<n;index++) {
			System.out.print("firstArray["+index+"]= ");
			firstArray[index]=sc.nextInt();
		}
		for (int index=0;index<m;index++) {
			System.out.print("secondArray["+index+"]= ");
			secondArray[index]=sc.nextInt();
		}
		System.out.println(Arrays.toString(problemSolver(firstArray,secondArray)));
	}
	
}
