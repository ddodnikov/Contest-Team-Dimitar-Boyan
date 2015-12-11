<<<<<<< HEAD
=======

>>>>>>> d22900ab883fb642c9691118e248e1282af3bd87
public class Word {
	
	String cipheredWord;
	String decipheredWord;
	
	String decipher(String cipheredWord , char[][] key) {
		
		cipheredWord = cipheredWord.toUpperCase();
		
		if(cipheredWord.length()%2 != 0) {
			cipheredWord += "P";
		}
		
		String decipheredWord = "";
		
		int[] indexes = new int[4];
		
		for(int index = 0; index < cipheredWord.length() / 2; index++) {
			
			for(int row = 0; row < 5; row++) {
				for(int col = 0; col < 5; col++) {
					if(key[row][col] == cipheredWord.charAt(index*2)) {
						indexes[0] = row;
						indexes[1] = col;
					}
					if(key[row][col] == cipheredWord.charAt(index*2+1)) {
						indexes[2] = row;
						indexes[3] = col;
					}
				}
			}
			
			if(indexes[0] == indexes[2]) {
				if(indexes[1] != 4) {
					decipheredWord += key[indexes[0]][indexes[1]+1];
				} else {
					decipheredWord += key[indexes[0]][0];
				}
				if(indexes[3] != 4) {
					decipheredWord += key[indexes[2]][indexes[3]+1];
				} else {
					decipheredWord += key[indexes[2]][0];
				}
			} 
			
			if(indexes[1] == indexes[3]) {
				if(indexes[0] != 4) {
					decipheredWord += key[indexes[0]+1][indexes[1]];
				} else {
					decipheredWord += key[0][indexes[1]];
				}
				if(indexes[2] != 4) {
					decipheredWord += key[indexes[2]+1][indexes[3]];
				} else {
					decipheredWord += key[0][indexes[3]];
				}
			}
			
			if(indexes[0] != indexes[2] && indexes[1] != indexes[3]) {
				decipheredWord += key[indexes[0]][indexes[3]];
				decipheredWord += key[indexes[2]][indexes[1]];
			}
		}
		
		System.out.println("Word to be deciphered : " + cipheredWord);
		return decipheredWord;
		
	}
	
	String cipher(String decipheredWord , char[][] key) {
		
		decipheredWord = decipheredWord.toUpperCase();
		
		if(decipheredWord.length()%2 != 0) {
			decipheredWord += "P";
		}
		
		String cipheredWord = "";
		
		int[] indexes = new int[4];
		
		for(int index = 0; index < decipheredWord.length() / 2; index++) {
			
			for(int row = 0; row < 5; row++) {
				for(int col = 0; col < 5; col++) {
					if(key[row][col] == decipheredWord.charAt(index*2)) {
						indexes[0] = row;
						indexes[1] = col;
					}
					if(key[row][col] == decipheredWord.charAt(index*2+1)) {
						indexes[2] = row;
						indexes[3] = col;
					}
				}
			}
			
			if(indexes[0] == indexes[2]) {
				if(indexes[1] != 0) {
					cipheredWord += key[indexes[0]][indexes[1]-1];
				} else {
					cipheredWord += key[indexes[0]][4];
				}
				if(indexes[3] != 0) {
					cipheredWord += key[indexes[2]][indexes[3]-1];
				} else {
					cipheredWord += key[indexes[2]][4];
				}
			} 
			
			if(indexes[1] == indexes[3]) {
				if(indexes[0] != 0) {
					cipheredWord += key[indexes[0]-1][indexes[1]];
				} else {
					cipheredWord += key[4][indexes[1]];
				}
				if(indexes[2] != 0) {
					cipheredWord += key[indexes[2]-1][indexes[3]];
				} else {
					cipheredWord += key[4][indexes[3]];
				}
			}
			
			if(indexes[0] != indexes[2] && indexes[1] != indexes[3]) {
				cipheredWord += key[indexes[0]][indexes[3]];
				cipheredWord += key[indexes[2]][indexes[1]];
			}
		}
		
		System.out.println("Word to be ciphered : " + decipheredWord);
		return cipheredWord;
		
	}
	

	        
}