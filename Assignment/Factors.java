package Assignment;

import java.util.Scanner;

public class Factors {
	public static void main(String arg[]) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Ente the number: ");
	int num=obj.nextInt();
	for(int i=1;i<=num;i++) {
		if(num%i==0) 
	System.out.print(i+",");
	}
	obj.close();
}}
