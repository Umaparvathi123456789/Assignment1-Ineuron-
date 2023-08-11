package Assignment;

import java.util.Scanner;

public class LeapYearorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year=num.nextInt();
		if (year%4==0){
			System.out.println(year+" is a Leap Year");
		}
			else
			{
				System.out.println(year+" is Not a Leap Year");
			}
        num.close();

	}

}
