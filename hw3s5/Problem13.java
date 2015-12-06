package hw3s5;
import java.util.Scanner;


public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int[] array = new int[32];
		int i=0,helper=n;
		while (helper/2!=0) {
			array[array.length-1-i]=helper%2;
			helper/=2;
			i++;
			if (helper==1) {
				array[array.length-1-i]=1;
			}
		}
		if (n<0) {
			array[0]=1;
		}
		for (int j=0;j<32;j++) {
			System.out.print(array[j]);
		}
		
	}

}
