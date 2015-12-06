package hw5s5;
import java.util.Scanner;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Input string:");
		String text = sc.nextLine();
		text=text.toLowerCase();
		int counter=0;
		int number=0;
		int sum=0;
		for (int index=0;index<text.length();index++) {
			while (48<=text.charAt(index+counter) && text.charAt(index+counter)<=57) {
				counter++;
				if (index+counter>=text.length()) {
					break;
				}
			}
			
			if (counter>0) {
				String temp=text.substring(index, index+counter);
				System.out.println(temp+"temp");
				for (int tempIndex=0;tempIndex<temp.length();tempIndex++) {
					number*=10;
					number+=temp.charAt(tempIndex)-'0';
				}
				if (text.charAt(index-1)=='-') {
					number=-number;
					System.out.println(number);
				}
				index+=temp.length();
			}
			sum+=number;
			number=0;
			counter=0;
		}
		System.out.println("sum= "+sum);
	}

}
