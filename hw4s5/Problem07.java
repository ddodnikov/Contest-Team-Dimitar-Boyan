package hw4s5;
import java.util.Scanner;

public class Problem07 {

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
		for (int i=0;i<rows*cols;i++) {
			if (((i/cols)+(i%rows))%2==0) {
				System.out.print(array[i/cols][i%rows]+" ");
				sumRow+=array[i/cols][i%rows];
			}
			if (i/cols<(i+1)/cols) {
				System.out.print("sumRow= "+sumRow+"\n");
				sumAllRows+=sumRow;
				sumRow=0;
			}
		}
		System.out.println("sumAllRows= "+sumAllRows);
	}
}

