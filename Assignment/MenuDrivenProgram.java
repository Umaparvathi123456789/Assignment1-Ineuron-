package Assignment;
import java.util.Scanner;
public class MenuDrivenProgram {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the customer choosen of number: ");
		int input=obj.nextInt();
			if(input!=6) {
			System.out.println("you can now choose the numbers");
		System.out.println("choose number1: ");
		int n1=obj.nextInt();
		System.out.println("choose number2: ");
		int n2=obj.nextInt();
		int result;
		switch (input) {
		case 1:
			result=n1*n2;
			System.out.println("result of the given choosen number= "+result);
			break;
		case 2:
			result=n1+n2;
			System.out.println("result of the given choisen number= "+result);
			break;
		case 3:
			result=n1-n2;
			System.out.println("result of the given choisen number= "+result);
			break;
		case 4:
			result=n1%n2;
			System.out.println("result of the given choisen number= "+result);
			break;
		case 5:
			result=n1/n2;
			System.out.println("result of the given choisen number= "+result);
			break;
		default:
			System.out.println("you fetch the results");
		}
			}
		obj.close();
	}}
