package hw3s5;
import java.util.Scanner;

public class Problem08 {

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
		int counter=1,number=0,counterMax=0;
		for (int i=1;i<n;i++) {
			if (array[i]==array[i-1]) {
				counter++;
				number=array[i];
				continue;
			}
			if (counter!=1) {
				if (counterMax<counter) {
					counterMax=counter;
				}
				counter=1;
			}
		}
		for (int i=0;i<counterMax;i++) {
			System.out.print(number+" ");
		}
	}

}
