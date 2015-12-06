package hw1s5;
import java.util.Scanner;

public class prblm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		short a;
		while (true) {
			System.out.print("there must be no 0 in the following 3digit number!\na= ");
			a=sc.nextShort();
			if (a/100!=0 && a/10!=0 && a%10!=0)
				break;
		}
		if ( a/(a%10)==0?true:false && ( a/( (a/10)%10)==0)?true:false && ( a/( (a/100)%10))==0?true:false) {
			System.out.println(a+"can be divided without a remainder to all it's digits");
		}
	}

}
