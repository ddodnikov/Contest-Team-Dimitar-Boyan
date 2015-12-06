package hw3s5;
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] array = new int[7];
		for (int i=0;i<7;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.print("\nThe average is "+(double)sum/7+" with the value in the array closest to it is ");
		double min=(double)sum/7-array[0];
		int index=0;
		for (int i=0;i<7;i++) {
			if (min>Math.abs((double)sum/7-array[i]) ) {
				min=(double)sum/7-array[i];
				index=i;
			}
		}
		System.out.print(array[index]);
	}

}
