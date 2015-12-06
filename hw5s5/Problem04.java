package hw5s5;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first,second;
		System.out.println("Please input two names separated by \", \" or by new line");
		Scanner sc = new Scanner(System.in).useDelimiter(", |\\n");
		// | : The choice (aka alternation or set union) operator matches either the expression
		// before or the expression after the operator. For example, abc|def matches "abc" or "def". ~Wikipedia
		first=sc.next();
		second=sc.next();
		int firstValue=0;
		int secondValue=0;
		for (int index=0;index<first.length();index++) {
			firstValue+=first.charAt(index);
		}
		for (int index=0;index<second.length();index++) {
			secondValue+=second.charAt(index);
		}
		if (firstValue<secondValue) {
			System.out.println(second);
		}
		else if (firstValue>secondValue) {
			System.out.println(first);
		}
		else {
			System.out.println("both names have equal ASCII value\n"+first+"\n"+second);
		}
	}

}
