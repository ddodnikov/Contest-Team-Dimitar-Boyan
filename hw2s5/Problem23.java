package hw2s5;
import java.util.Scanner;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1;i<=9;i++) {
			for (int j=0+i;j<=9;j++) {
				System.out.print(i+"*"+j+"="+i*j+"; ");
			}
			System.out.println();
		}
	}

}
