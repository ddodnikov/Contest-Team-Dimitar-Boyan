package hw4s5;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows,cols;
		Scanner sc = new Scanner(System.in);
		System.out.print("rows= ");
		rows=sc.nextInt();
		System.out.print("cols= ");
		cols=sc.nextInt();
		int[][] array = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print("array["+i+"]["+j+"]= ");
				array[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<cols;i++) {
			for (int j=0;j<rows;j++) {
				System.out.print(array[rows-1-j][i]+" ");
			}
			System.out.println();
		}
	}

}
