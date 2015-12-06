package hw1s5;
import java.util.Scanner;

public class prblm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		byte day,month;
		short year;
		System.out.print("day= ");
		day=sc.nextByte();
		System.out.print("month= ");
		month=sc.nextByte();
		System.out.print("year= ");
		year=sc.nextShort();
		if (day==29 && month==2) {
			if ( year%4==0 && (year%100!=0 || year%400==0) ) {
				System.out.println(1+","+3+","+year);
			}
			else
				System.out.println("invalid input");
		}
		else {
			switch(month) {
			case 2: case 4: case 6: case 9: case11: 
				//not sure why case scopes aren't in actual scopes { }
				if (day<30) {
					System.out.println(day+1+","+month+","+year);
					break;
				}
				if (day==30) {
					System.out.println(1+","+month+1+","+year);
					break;
				}
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (day<31) {
						System.out.println(day+1+","+month+","+year);
						break;
				}
				else if (day==31) {
					if (month%12!=0) {
						System.out.println(1+","+month+1+","+year);
						break;
					}
					else {
						System.out.println(1+","+1+","+year+1);
						break;
					}
				}			
				default:
					System.out.println("invalid input");
					break;
			}
		}
	}

}
