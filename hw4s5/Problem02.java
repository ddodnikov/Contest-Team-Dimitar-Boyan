package hw4s5;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows,cols;
		Scanner sc = new Scanner(System.in);
		System.out.print("rows= ");
		rows=sc.nextInt();
		cols=rows;
		int[][] array = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print("array["+i+"]["+j+"]= ");
				array[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<rows;i++) {
				System.out.print(array[i][i]);
		}
		System.out.println();
		for (int i=0;i<rows;i++) {
			System.out.print(array[i][cols-1-i]);
		}
	}

}
