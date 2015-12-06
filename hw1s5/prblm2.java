package hw1s5;
import java.util.Scanner;

public class prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a,b,sum,product,difference,remainder,division;
		System.out.print("a= ");
		a=sc.nextInt();
		System.out.print("b= ");
		b=sc.nextInt();
		sum=a+b;
		difference=a-b;
		product=a*b;
		division=a/b;
		remainder=a%b;
		System.out.println("sum= "+sum+" ,difference= "+difference+" ,product= "+product+" ,divison= "+division+" ,remainder= "+remainder);
		
		// 2nd part with the numbers being of type double
		
		double aDouble,bDouble,sumDouble,productDouble,differenceDouble,remainderDouble,divisionDouble;
		System.out.print("aDouble= ");
		aDouble=sc.nextDouble();
		System.out.print("bDouble= ");
		bDouble=sc.nextDouble();
		sumDouble=aDouble+bDouble;
		differenceDouble=aDouble-bDouble;
		productDouble=aDouble*bDouble;
		divisionDouble=aDouble/bDouble;
		remainderDouble=aDouble%bDouble;
		System.out.println("sumDouble= "+sumDouble+" ,differenceDouble= "+differenceDouble+" ,productDouble= "+productDouble+
				" ,divisonDouble= "+divisionDouble+" ,remainderDouble= "+remainderDouble);
	}

}
