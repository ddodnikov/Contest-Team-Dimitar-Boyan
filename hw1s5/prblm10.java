package hw1s5;
import java.util.Scanner;

public class prblm10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		short waterTank;
		byte bucket1=2,bucket2=3;
		System.out.print("waterTank capacity= ");
		waterTank = sc.nextShort();
		if (waterTank%5!=1)
		System.out.println(waterTank/5 +" times both buckets + an extra "+( (waterTank/5)%3==0?"bucket of 3L ":"")+
				( (waterTank)/5%2==0?"bucket of 2L":"") );
		else
			System.out.println( (waterTank-5)/5+" times both buckets + an extra 2 buckets of 3L");
		// If I'm not allowed to fill only a single bucket twice, then this problem is unsolvable in a situation where the water
		// tank's capacity % 5 = 1
	}

}
