package hw5s5;
import java.util.Arrays;

public class Problem11 {

	static int[] problemSolver(int[] a) {
		System.out.println(Arrays.toString(a)); // wasn't sure which of the 2 solutions was expected
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3};
		System.out.println(Arrays.toString(problemSolver(array))); // I think this was how it was showed in the lecture? simply .toString
	}															   // does not work because it prints the string of the reference

}
