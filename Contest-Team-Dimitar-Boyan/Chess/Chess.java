import java.util.Scanner;

public class Chess {
	
	static void horseMoves (char[][] array, int row, int column) {

		array[row][column] = '*';

		for(int a = -2; a < 3; a++) {
			for(int b = -2; b < 3; b++) {
				if((row+a) >= 0 && (column+b) >= 0 && (row+a) < array.length && (column+b) < array[0].length
					&&(Math.abs(a)+Math.abs(b) == 3) && array[row+a][column+b] != '*'){
					horseMoves(array, row+a, column+b);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns : ");
		int columns = scan.nextInt();
		
		char[][] chessBoard = new char[rows][columns];
		
		System.out.println("Enter row of starting point : ");
		int rowOfStartingPoint = scan.nextInt() - 1;
		System.out.println("Enter column of starting point : ");
		int columnOfStratingPoint = scan.nextInt() - 1;
		
		horseMoves(chessBoard, rowOfStartingPoint, columnOfStratingPoint);
		
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < columns; col++) {
				System.out.print(chessBoard[row][col] + " ");
			}
			System.out.println();
		}

	}

}
