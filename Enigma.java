
import java.util.Scanner;

public class Enigma {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Word word = new Word();
		System.out.println("Enter word : ");
		word.cipheredWord = scan.nextLine();
		word.decipheredWord = word.cipheredWord;
				
		Key key = new Key();
		key.body = key.enterBody(key);
		
		int choice = 0;
		while(choice != 1 && choice != 2) {
			System.out.println("Enter 1 for deciphering and 2 for ciphering : ");
			choice = scan.nextInt();
		}
					
		if(choice == 1) {
			key.printKey(key);
			word.decipheredWord = word.decipher(word.cipheredWord, key.body);
			System.out.println("Deciphered word : " + word.decipheredWord);
		} 
		if(choice == 2) {
			word.cipheredWord = word.encrypt(key);
			System.out.println("Ciphered word : " + word.cipheredWord);
		} 
		
	}

}
