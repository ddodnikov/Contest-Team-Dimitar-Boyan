package hw3s5;
import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=0;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		for (int i=0;i<7;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextInt();
		}
		for (int i=0;i<7;i++) {
			if (array[i]%5==0 && array[i]>5) {
				System.out.print(array[i]+(i==6?"; ":", ") );  //is this acceptable usage of " ?: " operator ?
				counter++;
			}
		}
		System.out.println(" "+counter+" numbers");
	}

}
