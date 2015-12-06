package hw3s5;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		double[] array = new double[n];
		int counter=0;
		for (int i=0;i<n;i++) {
			System.out.print("array["+i+"]= ");
			double helper=sc.nextDouble();
			if (helper>=-2.99 && helper<=2.99) {
				array[i]=helper;
				if (helper==0) {
					counter++;
				}
			}
		}
		for (int i=0;i<n;i++) {
			if (array[i]==0 && counter!=0) {
				System.out.print(array[i]+"; ");
				counter--;
				continue;
			}
			else if (array[i]==0 && counter==0) {
				break;
			}
			System.out.print(array[i]+"; ");
		}
	}

}
