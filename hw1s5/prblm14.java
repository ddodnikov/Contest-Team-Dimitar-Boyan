package hw1s5;
import java.util.Scanner;

public class prblm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte aHorizontal,aVertical,bHorizontal,bVertical;
		Scanner sc = new Scanner(System.in);
		System.out.print("aHorizontal= ");
		aHorizontal=sc.nextByte();
		System.out.print("aVertical= ");
		aVertical=sc.nextByte();
		System.out.print("bHorizontal= ");
		bHorizontal=sc.nextByte();
		System.out.print("bVertical= ");
		bVertical=sc.nextByte();
		System.out.println( (aHorizontal+aVertical)%2!=(bHorizontal+bVertical)%2?"Same colour":"Different colour");
	}

}
