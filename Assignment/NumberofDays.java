package Assignment;
import java.util.Scanner;
public class NumberofDays {
	public static void main(String args[]) {
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the month number: ");
	int a=num.nextInt();
	switch (a) {
	case 1:
		System.out.println("31 days");
		break;
	case 2:
		System.out.println("28 or else 29 if it was a leap year");
		break;
	case 3:
		System.out.println("31 days");
		break;
	case 4:
		System.out.println("30 days");
		break;
	case 5:
		System.out.println("31 days");
		break;
	case 6:
		System.out.println("30 days");
		break;
		case 7:
			System.out.println("31 days");
			break;
		case 8:
			System.out.println("30 days");
			break;
		case 9:
			System.out.println("31 days");
			break;
		case 10:
			System.out.println("30 days");
			break;
		case 11:
			System.out.println("31 days");
			break;
		case 12:
			System.out.println("31 days");
			break;
			default:
				System.out.println("there is no month with these number");
	}
	num.close();
}
}

