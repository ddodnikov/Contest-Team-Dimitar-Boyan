package hw3s5;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		double[] array = new double[10];
		double[] array2 = new double[10];
		for (int i=0;i<10;i++) {
			System.out.print("array["+i+"]= ");
			array[i]=sc.nextDouble();
		}
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		for (int i=0;i<array.length;i++) {
			if (array[i]<-0.231) {
				array2[i]= Math.pow(i, 2)+41.25;
			}
			else {
				array2[i]=array[i]*(i+1);
			}
		}
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		double average=0;
		for (int i=0;i<array2.length;i++) {
			System.out.println(array2[i]+" ");
			average+=array2[i];
		}
		average/=array2.length;
		System.out.println("average: "+average); // average value of a single element? That would be the element itself. Assuming it's
	}											 // the average of the whole array
}
