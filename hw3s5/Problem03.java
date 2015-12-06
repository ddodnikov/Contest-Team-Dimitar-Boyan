package hw3s5;
import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int[] array = new int[10];
		for (int i=0;i<10;i++) {
			if (i<2) {
				array[i]=n;
				System.out.println("array["+i+"]= "+array[i]);
				continue;
			}
			array[i]=array[i-1]+array[i-2];
			System.out.println("array["+i+"]= "+array[i]);
		}
	}

}
