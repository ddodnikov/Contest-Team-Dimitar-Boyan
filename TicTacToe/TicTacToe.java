import java.util.Scanner;

public class TicTacToe {

	int[][][] board = new int[3][3][1];
	boolean isGameOver=false;
	int playsCounter=0;
	
	// the main function of the game, the method that starts the whole game for the user(s) to play
	void play() {
		int playerIndex=1;
		Scanner sc = new Scanner(System.in);
		while (isGameOver!=true) {
			System.out.print("row col? ");
			int row=sc.nextInt();
			int col=sc.nextInt();
			while (row<0 || row>2 || col<0 || col>2) {
				System.out.println("Invalid input, row and col must be in [0,2]");
				System.out.print("row col? ");
				row=sc.nextInt();
				col=sc.nextInt();
			}
			placeSymbol(playerIndex%2,row,col);
			playerIndex++;
		}
	}
	
	// places the symbol of the player in the inputed coordinates, has a verification if it's already taken
	void placeSymbol(int player, int row, int col) {
		if (this.board[row][col][0]!=0) {
			System.out.println("Invalid input, position is already taken!");
			do {
				Scanner sc = new Scanner(System.in);
				System.out.print("row col? ");
				row=sc.nextInt();
				col=sc.nextInt();
				if (row<0 || row>2 || col<0 || col>2) {
					System.out.println("Invalid input, row and col must be in [0,2]");
				}
			} while (row<0 || row>2 || col<0 || col>2);
		}
		player = player == 1 ? 1 : 2;
		this.board[row][col][0]=player;
		this.playsCounter++;
		this.print();
		// no point in checking if there are under 4 plays since neither side can meet a victory condition
		if (this.playsCounter>4) {
			this.result(row, col, player);
		}
	}
	
	// prints the board
	void print() {
		for (int row=0;row<3;row++) {
			for (int col=0;col<3;col++) {
				if (this.board[row][col][0]==0) {
					System.out.print("_ ");
				}
				if (this.board[row][col][0]==1) {
					System.out.print("O ");
				}
				if (this.board[row][col][0]==2) {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
	
	// result checks if the game is over and if yes, outputs by what condition
	void result(int row, int col, int symbol) {
			if (checkWinCondition("row",row,col)) {
				System.out.println("Player "+symbol+" wins with 3 in a row!");
				return;
			}
			if (checkWinCondition("col",row,col)) {
				System.out.println("Player "+symbol+" wins with 3 in a column!");
				return;
			}
			if (checkWinCondition("diagonal",row,col)) {
				System.out.println("Player "+symbol+" wins with 3 in a diagonal!");
				return;
			}
			if (this.playsCounter==9) {
				System.out.println("All positions taken but no victory condition was met, the game is a TIE !");
				isGameOver=true;
				return;
			}
	} // If returns are removed since isGameOver is true and that's the output of checkWinCondition, the program will output
	  // all win conditions (without the TIE) below the met win condition as well.
	
	// checkWinCondition checks whether there are 3 of the same symbol in a row/column/diagonal
	boolean checkWinCondition(String condition,int rowOriginal,int colOriginal) {
		int counter=0;
		for (int index=0;index<5;index++) {
			if (condition.equals("row")) {
				if ( checkSymbol(rowOriginal-2+index,colOriginal,rowOriginal,colOriginal) ) {
					counter++;
				}
				else {
					counter=0;
				}
			}
			if (condition.equals("col")) {
				if ( checkSymbol(rowOriginal,colOriginal-2+index,rowOriginal,colOriginal) ) {
					counter++;
				}
				else {
					counter=0;
				}
			}
			if (condition.equals("diagonal")) {
				if ( checkSymbol(rowOriginal-2+index,colOriginal-2+index,rowOriginal,colOriginal) ) {
					counter++;
				}
				else {
					counter=0;
				}
			}
			if (counter==3) {
				this.isGameOver=true;
				break;
			}
		}
		return this.isGameOver;
	}
	// checkSymbol checks if a symbol at certain position is the same as the one in the function it was called from
	boolean checkSymbol(int row, int col,int rowOriginal, int colOriginal) {
		if ( (row<0 || row>2) || (col<0 || col>2) ) {
			return false;
		}
		return this.board[row][col][0]==this.board[rowOriginal][colOriginal][0];
	}
}
