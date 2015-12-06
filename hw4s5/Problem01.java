package hw4s5;
import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=6,cols=5,min,max;
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print("array["+i+"]["+j+"]= ");
				array[i][j]=sc.nextInt();
			}
		}
		min=array[0][0];
		max=array[0][0];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				if (array[i][j]<min) {
					min=array[i][j];
				}
				if (array[i][j]>max) {
					max=array[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("min= "+min+"; max= "+max);
	}

}
