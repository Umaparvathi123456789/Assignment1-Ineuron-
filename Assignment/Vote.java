package Assignment;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the age of the person: ");
		int age=num.nextInt();
		if (age==18|age>18){
			System.out.println("Eligible to Vote");
		}
			else
			{
				System.out.println("Not Eligible");
			}
        num.close();
	}

	}