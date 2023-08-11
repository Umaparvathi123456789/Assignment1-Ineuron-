package Assignment;

import java.util.Scanner;

public class FactorsSum {
		public static void main(String args[]) {
			Scanner obj=new Scanner(System.in);
			System.out.println("Ente the number: ");
			int num=obj.nextInt();
			int sum=0;
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
		}
			}
			System.out.print(sum);
			obj.close();
	}
}
