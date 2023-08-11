package Assignment;

import java.util.Scanner;

public class LargestAmongThreenumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the a number: ");
		int a=num.nextInt();
		System.out.println("Enter the b number: ");
		int b=num.nextInt();
		System.out.println("Enter the c number: ");
		int c=num.nextInt();
		if(a>b & a>c &a!=b &a!=c) {
			System.out.println("a is a Largest Number");
		}
		else if(b>c &b!=c)
			{
				System.out.println("b is a Lagrest Number");
			}
		else if(c!=a &c!=b) {
			System.out.println("c is a Largest numbers");
		}
		else
		{
			System.out.println("a.b.c are Equal number");
		}
        num.close();
}}
