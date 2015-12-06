package hw3s5;
import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		double[] array = new double[n];
		for (int i=0;i<n;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextDouble();
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (array[i]>array[j]) {
					double helper=array[i];
					array[i]=array[j];
					array[j]=helper;
				}
			}
		}
		for (int i=0;i<3;i++) {
			System.out.println(array[i]);
		}
	}
}
