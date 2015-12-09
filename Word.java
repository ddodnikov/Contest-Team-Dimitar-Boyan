package encryptionTask;

public class Word {

    String text;
    
    int[] indexGetter(char[][] encryptionKey) {
    	text=text.toUpperCase();
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
            boolean isEven=false;
            if (this.text.length()%2!=0) {
                encryptedText = new char[this.text.length()+1];
            }
            else {
                encryptedText = new char[this.text.length()];
                isEven=true;
            }
            int[] textIndexes=indexGetter(encryptionKey);
            for (int index=0;index<this.text.length()+this.text.length()%2;index+=2) {
            	if (index+1==this.text.length()+this.text.length()%2-1 && isEven==false) {
            		if (textIndexes[index]/10==textIndexes[index+1]/10) {
                        encryptedText[index]=encryptionKey[textIndexes[index]/10][(textIndexes[index]%10+1)%6];
                        continue;
                    } // Moving one column to the right
            		if (textIndexes[index]%10==textIndexes[index+1]%10) {
                    	encryptedText[index]=encryptionKey[(textIndexes[index]/10+1)%6][textIndexes[index]%10];
                        continue;
            		} // Moving one row downwards
            		// !!!!!!!!!!!!!!!!! if index=element and index+1=P , what do with index
            	} 
                if (textIndexes[index]/10==textIndexes[index+1]/10) {
                    encryptedText[index]=encryptionKey[textIndexes[index]/10][(textIndexes[index]%10+1)%6];
                    encryptedText[index+1]=encryptionKey[textIndexes[index]/10][(textIndexes[index]%10+1)%6];
                    continue;
                } // Moving one column to the right
                if (textIndexes[index]%10==textIndexes[index+1]%10) {
                	encryptedText[index]=encryptionKey[(textIndexes[index]/10+1)%6][textIndexes[index]%10];
                    encryptedText[index+1]=encryptionKey[(textIndexes[index+1]/10+1)%6][textIndexes[index]%10];
                    continue;
                } // Moving one row downwards
                encryptedText[index]=encryptionKey[textIndexes[index]/10][textIndexes[index+1]%10];
                encryptedText[index+1]=encryptionKey[textIndexes[index+1]/10][textIndexes[index]%10];
                // swapping columns
            }
            return encryptedText.toString();
        }
        
    
} 
