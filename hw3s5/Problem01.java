package hw3s5;
import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int[] array=new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextInt();
		}
		int min = 0;
		for (int i=0;i<n;i++) {
			if (array[i]%3==0) {
				if (array[i]<min || min==0) {
					min=array[i];
				}
			}
		}
		System.out.println("minimum dividend of 3 is: "+min);
	}

}
