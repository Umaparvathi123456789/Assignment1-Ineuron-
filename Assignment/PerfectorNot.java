package Assignment;

import java.util.Scanner;

public class PerfectorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number : ");
			int num=obj.nextInt();
			int sum=0;
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}}
				if(sum==num) {
					System.out.println("perfect number");
				}
				else {
					System.out.println("not perfect number");
				}
				
				obj.close();
	}

}
