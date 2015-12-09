package Team;

public class Word {
	
	String cipheredWord;
	String decipheredWord;
	
	String decipher(String cipheredWord , char[][] key) {
		
		cipheredWord = cipheredWord.toUpperCase();
		
		if(cipheredWord.length()%2 != 0) {
			cipheredWord += "P";
		}
		
		String decipheredWord = "";
		
		int rowFirstLetter = 0;
		int colFirstLetter = 0;
		int rowSecondLetter = 0;
		int colSecondLetter = 0;
		
		for(int index = 0; index < cipheredWord.length() / 2; index++) {
			
			for(int row = 0; row < 5; row++) {
				for(int col = 0; col < 5; col++) {
					if(key[row][col] == cipheredWord.charAt(index*2)) {
						rowFirstLetter = row;
						colFirstLetter = col;
					}
					if(key[row][col] == cipheredWord.charAt(index*2+1)) {
						rowSecondLetter = row;
						colSecondLetter = col;
					}
				}
			}
			
			if(rowFirstLetter == rowSecondLetter) {
				if(colFirstLetter != 4) {
					decipheredWord += key[rowFirstLetter][colFirstLetter+1];
				} else {
					decipheredWord += key[rowFirstLetter][0];
				}
				if(colSecondLetter != 4) {
					decipheredWord += key[rowFirstLetter][colSecondLetter+1];
				} else {
					decipheredWord += key[rowFirstLetter][0];
				}
			} 
			
			if(colFirstLetter == colSecondLetter) {
				if(rowFirstLetter != 4) {
					decipheredWord += key[rowFirstLetter+1][colFirstLetter];
				} else {
					decipheredWord += key[0][colFirstLetter];
				}
				if(rowSecondLetter != 4) {
					decipheredWord += key[rowSecondLetter+1][colSecondLetter];
				} else {
					decipheredWord += key[0][colSecondLetter];
				}
			}
			
			if(rowFirstLetter != rowSecondLetter && colFirstLetter != colSecondLetter) {
				decipheredWord += key[rowFirstLetter][colSecondLetter];
				decipheredWord += key[rowSecondLetter][colFirstLetter];
			}
		}
		
		System.out.println("Word to be deciphered : " + cipheredWord);
		return decipheredWord;
		
	}
	

	    int[] indexGetter(Key encryptionKey) {
	    	decipheredWord=decipheredWord.toUpperCase();
	        int[] decipheredWordIndexes = new int[this.decipheredWord.length()];
	        for (int index=0;index<encryptionKey.body.length;index++) {
	            for (int index2=0;index2<encryptionKey.body[0].length;index2++) {
	                for (int indexOfLetter=0;indexOfLetter<this.decipheredWord.length();indexOfLetter++) {
	                    if (this.decipheredWord.charAt(indexOfLetter)==encryptionKey.body[index][index2]) {
	                        decipheredWordIndexes[indexOfLetter]=index*10+index2;
	                    }
	                }
	            }
	        }
	        return decipheredWordIndexes;
	    }
	        String encrypt(Key encryptionKey) {
	            char[] cipheredWord;
	            boolean isEven=false;
	            if (this.decipheredWord.length()%2!=0) {
	                cipheredWord = new char[this.decipheredWord.length()+1];
	            }
	            else {
	                cipheredWord = new char[this.decipheredWord.length()];
	                isEven=true;
	            }
	            int[] decipheredWordIndexes=indexGetter(encryptionKey);
	            for (int index=0;index<this.decipheredWord.length()+this.decipheredWord.length()%2;index+=2) {
	                if (decipheredWordIndexes[index]/10==decipheredWordIndexes[index+1]/10) {
	                    cipheredWord[index]=encryptionKey.body[decipheredWordIndexes[index]/10][(decipheredWordIndexes[index]%10+1)%5];
	                    cipheredWord[index+1]=encryptionKey.body[decipheredWordIndexes[index+1]/10][(decipheredWordIndexes[index+1]%10+1)%5];
	                    continue;
	                } // Moving one column to the right
	                if (decipheredWordIndexes[index]%10==decipheredWordIndexes[index+1]%10) {
	                	cipheredWord[index]=encryptionKey.body[(decipheredWordIndexes[index]/10+1)%5][decipheredWordIndexes[index]%10];
	                    cipheredWord[index+1]=encryptionKey.body[(decipheredWordIndexes[index+1]/10+1)%5][decipheredWordIndexes[index]%10];
	                    continue;
	                } // Moving one row downwards
	                cipheredWord[index]=encryptionKey.body[decipheredWordIndexes[index]/10][decipheredWordIndexes[index+1]%10];
	                cipheredWord[index+1]=encryptionKey.body[decipheredWordIndexes[index+1]/10][decipheredWordIndexes[index]%10];
	                // swapping columns
	            }
	            String helpWord = String.valueOf(cipheredWord);
	            return helpWord;
	        }
	        
}
