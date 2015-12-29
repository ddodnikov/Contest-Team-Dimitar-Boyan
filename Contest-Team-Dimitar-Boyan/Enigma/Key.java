import java.util.Scanner;

public class Key {
	
	char[][] body;
	
	char[][] enterBody(Key key) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] newKey = new char[5][5];
		System.out.println("Enter key : ");
		
		for(int index = 0; index < 5; index++) {
			for(int sec = 0; sec < 5; sec++) {
				newKey[index][sec] = scan.next().charAt(0);
			}
		}
		
		return newKey;
	}
	
	void printKey(Key key) {
		
		System.out.println("Key : ");
		for(int index = 0; index < 5; index++) {
			for(int sec = 0; sec < 5; sec++) {
				System.out.print(key.body[index][sec] + " ");
			}
			System.out.println();
		}
		
	}

}
