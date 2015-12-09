package tasks;

public class Word {

	String text;
	
	int[] indexGetter(char[][] encryptionKey) {
		int[] textIndexes = new int[this.text.length()];
		for (int index=0;index<this.text.length();index++) {
			for (int index2=0;index<this.text.length();index2++) {
				for (int indexOfLetter=0;index<encryptionKey.length;indexOfLetter++) {
					if (this.text.charAt(indexOfLetter)==encryptionKey[index][index2]) {
						textIndexes[indexOfLetter]=index*10+index2;
					}
				}
			}
		}
		return textIndexes;
	}
		String encrypt(char[][] encryptionKey) {
			char[] encryptedText;
			if (this.text.length()%2!=0) {
				encryptedText = new char[this.text.length()+1];
			}
			else {
				encryptedText = new char[this.text.length()];
			}
			int[] textIndexes=indexGetter(encryptionKey);
			for (int index=0;index<this.text.length()/2;index+=2) {
				if (textIndexes[index]/10==textIndexes[index+1]/10) {
					encryptedText[index]=encryptionKey[textIndexes[index]/10+1][textIndexes[index]%10];
					encryptedText[index+1]=encryptionKey[textIndexes[index+1]/10+1][textIndexes[index]%10];
					continue;
				} // Moving one row downwards, check if condition is the same as assignment
				if (textIndexes[index]%10==textIndexes[index+1]%10) {
					encryptedText[index]=encryptionKey[textIndexes[index]/10][textIndexes[index]%10+1];
					encryptedText[index+1]=encryptionKey[textIndexes[index]/10][textIndexes[index]%10+1];
					continue;
				} // Moving one column to the right
				encryptedText[index]=encryptionKey[textIndexes[index]/10][textIndexes[index+1]%10];
				encryptedText[index+1]=encryptionKey[textIndexes[index+1]/10][textIndexes[index]%10];
				// swapping columns
			} 
			return encryptedText.toString();
		}
		
	
}
