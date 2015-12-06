package hw1s5;
import java.util.Scanner;

public class prblm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double a1,a2,a3,helper;
		System.out.print("a1= ");
		a1=sc.nextDouble();
		System.out.print("a2= ");
		a2=sc.nextDouble();
		System.out.print("a3= ");
		a3=sc.nextDouble();
		helper=a1;
		a1=a2;
		a2=a3;
		a3=helper;
		System.out.println("after swapping a1= "+a1+" , a2= "+a2+" , a3= "+a3);
	}

}
