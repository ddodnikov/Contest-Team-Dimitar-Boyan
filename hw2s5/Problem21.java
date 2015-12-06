package hw2s5;
import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,remainder=0;
		String[][] deck = new String[13][4];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input an integer in the scope of [1;51]\nn= ");
			n=sc.nextInt();
		} while (n<1 || n>51);
		for (int i=1;i<=13;i++) {
			for (int j=1;j<=4;j++) {
				switch (i) {
				case 1: deck[i-1][j-1]="2"; break;
				case 2: deck[i-1][j-1]="3"; break;
				case 3: deck[i-1][j-1]="4"; break;
				case 4: deck[i-1][j-1]="5"; break;
				case 5: deck[i-1][j-1]="6"; break;
				case 6: deck[i-1][j-1]="7"; break;
				case 7: deck[i-1][j-1]="8"; break;
				case 8: deck[i-1][j-1]="9"; break;
				case 9: deck[i-1][j-1]="10"; break;
				case 10: deck[i-1][j-1]="Jack"; break;
				case 11: deck[i-1][j-1]="Queen"; break;
				case 12: deck[i-1][j-1]="King"; break;
				case 13: deck[i-1][j-1]="Ace"; break;
				default: System.out.print("Error"); break;
				}
				switch (j) {
				case 1: deck[i-1][j-1]+=" of Clubs"; break;
				case 2: deck[i-1][j-1]+=" of Diamonds"; break;
				case 3: deck[i-1][j-1]+=" of Hearts"; break;
				case 4: deck[i-1][j-1]+=" of Spades"; break;
				default: System.out.print("Error"); break;
				}
			}
		}
		if ( (52-n)%4!=0) {
			remainder = n%4;
			for (int j=remainder%4-1;j<4;j++) {
				System.out.println(deck[n/4][j]);
			}
		}
		for (int i=(n+1)/4;i<13;i++) {
			for (int j=0;j<4;j++) {
				System.out.println(deck[i][j]);
			}
		}
	}

}
