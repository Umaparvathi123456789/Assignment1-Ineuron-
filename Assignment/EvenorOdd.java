package Assignment;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num1=num.nextInt();
		if (num1%2==0){
			System.out.println("Even Number");
		}
			else
			{
				System.out.println("Odd Number");
			}
        num.close();
	}

	}
