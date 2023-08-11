package Assignment;

import java.util.Scanner;

public class TriangleorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the angles of a triangle are: ");
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		sum=a+b+c;
	if(sum==180) {
		System.out.println("we can form a triangle with the given angles");
	}
	else {
		System.out.println("we can not form  a triangle with the given angles");
	}
	num.close();
	}

}
