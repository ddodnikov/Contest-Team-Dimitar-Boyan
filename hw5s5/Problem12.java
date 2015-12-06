package hw5s5;
import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {
	
	static int[] problemSolver(int n) {
		int[] array= new int[n];
		array[0]=1;
		for (int index=1;index<n;index++) {
			array[index]=array[index-1]+1;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n=sc.nextInt();
		System.out.println(Arrays.toString(problemSolver(n)));
	}

}
