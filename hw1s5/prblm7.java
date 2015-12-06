package hw1s5;
import java.util.Scanner;

public class prblm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int hour;
		double sumMoney;
		boolean healthy;
		System.out.print("hour= ");
		hour=sc.nextInt();
		System.out.print("sumMoney= ");
		sumMoney=sc.nextDouble();
		System.out.print("(please answer the following with true or false)\nhealthy: ");
		healthy=sc.nextBoolean();
		if (healthy && sumMoney>=10)
			System.out.println("I will go out to the cinema with friends");
		else if (healthy && sumMoney<10)
			System.out.println("I will go out to the cafe");
		else if (sumMoney>0)
			System.out.println("I won't go outside.I have money to buy medicine so I can get better,"
					+ " however I am uncertain how to do so, as my doctor can prescribe me medicine only if I go outside"); // *cough* *cough*
		else
			System.out.println("I'll stay inside and drink some ginseng tea until I get better");
	}

}
