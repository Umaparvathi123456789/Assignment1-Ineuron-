package Assignment;

import java.util.Scanner;

public class Eligibility {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter Eligibility criteria marks: ");
		int math=num.nextInt();
		int phy=num.nextInt();
		int chem=num.nextInt();
		int threeSubjects=num.nextInt();
		int mathAndPhy=num.nextInt();
		if(math>=65 & phy>=55 & chem>=55 & threeSubjects>=180 & mathAndPhy>=140) {
			System.out.println("Eligibility");
		}
		else
			System.out.println("Not Eligibility");
num.close();
}
}