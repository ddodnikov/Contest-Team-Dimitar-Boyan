package hw4s5;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=4,cols=4,sumHighestRow=0,sumHighestCol=0;
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print("array["+i+"]["+j+"]= ");
				array[i][j]=sc.nextInt();
			}
		}
		int sumRowHelper=0;
		for (int i=0;i<rows;i++) {
			sumRowHelper=0;
			for (int j=0;j<cols;j++) {
				sumRowHelper+=array[i][j];
			}
			if (sumRowHelper>sumHighestRow) {
				sumHighestRow=sumRowHelper;
			}
		}
		int sumColHelper=0;
		for (int i=0;i<cols;i++) {
			sumColHelper=0;
			for (int j=0;j<rows;j++) {
				sumColHelper+=array[j][i];
			}
			if (sumColHelper>sumHighestCol) {
				sumHighestCol=sumColHelper;
			}
		}
		if (sumHighestRow==sumHighestCol) {
			System.out.println("sumHighestRow= "+sumHighestRow+";\nsumHighestCol= "+sumHighestCol+";\n"+"sumHighestRow = sumHighestCol");
		}
		System.out.println("sumHighestRow= "+sumHighestRow+";\nsumHighestCol= "+sumHighestCol+";\n"+"sumHighestRow"+
							(sumHighestRow>sumHighestCol?" > ":" < ")+"sumHighestCol");
	}
}
