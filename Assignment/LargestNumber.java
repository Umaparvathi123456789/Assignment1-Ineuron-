package Assignment;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the a number: ");
		int a=num.nextInt();
		System.out.println("Enter the b number: ");
		int b=num.nextInt();
		if(a>b) {
			System.out.println("a is a Largest Number");
		}
		else if(a<b)
			{
				System.out.println("b is a Lagrest Number");
			}
		else {
			System.out.println("Botha and b are Equal numbers");
		}
        num.close();
	}
	}
