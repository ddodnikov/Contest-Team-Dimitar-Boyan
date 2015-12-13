import java.util.Scanner;

public class TicTacToe {

	int[][] board = new int[3][3];
	boolean isGameOver=false;
	int movesCounter=0;
	
	// the main function of the game, the method that starts the whole game for the user(s) to play
	void play() {
		int playerIndex=1;
		Scanner scan = new Scanner(System.in);
		while (isGameOver!=true) {
			System.out.print("Enter row and column? ");
			int row=scan.nextInt() - 1;
			int col=scan.nextInt() - 1;
			while (row<0 || row>2 || col<0 || col>2) {
				System.out.println("Invalid input, row and col must be in [1,3]");
				System.out.print("Enter row and column? ");
				row=scan.nextInt() - 1;
				col=scan.nextInt() - 1;
			}
			placeSymbol(playerIndex % 2,row,col);
			playerIndex++;
		}
	}
	
	// places the symbol of the player in the inputed coordinates, has a verification if it's already taken
	void placeSymbol(int player, int row, int col) {
		if (this.board[row][col]!=0) {
			System.out.println("Invalid input, position is already taken!");
			do {
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter row and column? ");
				row=scan.nextInt() - 1;
				col=scan.nextInt() - 1;
				if (row<0 || row>2 || col<0 || col>2) {
					System.out.println("Invalid input, row and column must be in [1,3]");
				}
			} while (row<0 || row>2 || col<0 || col>2);
		}
		player = (player == 1) ? 1 : 2;
		this.board[row][col]=player;
		this.movesCounter++;
		this.print();
		// no point in checking if there are under 4 plays since neither side can meet a victory condition
		if(this.movesCounter==9){
			System.out.println("The game ends in a tie!");
			isGameOver=true;
			return;
		}
		if (this.movesCounter>4) {
			this.result(row, col, player);
		}
	}
	
	// prints the board
	void print() {
		for (int row=0;row<3;row++) {
			for (int col=0;col<3;col++) {
				if (this.board[row][col]==0) {
					System.out.print("\u00AE ");
				}
				if (this.board[row][col]==1) {
					System.out.print("O ");
				}
				if (this.board[row][col]==2) {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}

	// result checks if the game is over and if yes, outputs by what condition
	void result(int row, int col, int player) {
		if (this.board[row][0] == this.board[row][1] && this.board[row][1] == this.board[row][2]) {
			System.out.println("Player " + player + " wins the game with 3 in a row!");
			isGameOver=true;
			return;
		}
		if (this.board[0][col] == this.board[1][col] && this.board[1][col] == this.board[2][col]) {
			System.out.println("Player " + player + " wins the game with 3 in a column!");
			isGameOver=true;
			return;
		}
		if((row + col) % 2 == 0) {
			if (this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) {
				System.out.println("Playerr " + player + " wins the game with 3 in a diagonal!");
				isGameOver=true;
				return;
			}
			if (this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0]) {
				System.out.println("Player " + player + " wins the game with 3 in a diagonal!");
				isGameOver=true;
				return;
			}
		}
	}
	
	//main method
	public static void main(String[] args) {

		TicTacToe game = new TicTacToe();
		game.play();
}
}
