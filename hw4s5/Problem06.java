package hw4s5;
import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=6,cols=6,sumRow=0,sumAllRows=0;
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print("array["+i+"]["+j+"]= ");
				array[i][j]=sc.nextInt();
			}
		}
		for (int i=1;i<rows;i+=2) {
			for (int j=0;j<cols;j++) {
				System.out.print(array[i][j]+" ");
				sumRow+=array[i][j];
			}
			System.out.print("sumRow= "+sumRow);
			System.out.println();
			sumAllRows+=sumRow;
			sumRow=0;
		}
		System.out.println("sumAllRows= "+sumAllRows);
	}
}
