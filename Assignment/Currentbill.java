package Assignment;
import java.util.Scanner;
public class Currentbill {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the name of the Customer: ");
		String name=num.nextLine();
		System.out.println("Enter the units of Customer: ");
		int unit=num.nextInt();
		System.out.println("enter the customer id:");
		int n=num.nextInt();
		double bill;
         if(unit<=199&unit!=0) {
        	 bill=unit*1.20;
        	 System.out.println(name+" customer with the id-"+n+" have to pay "+bill);
         }
         else if(unit==200|unit<400) {
        	 bill=unit*1.50;
         	 System.out.println(name+" customer with the id-"+n+" have to pay "+bill);
         }
         else if(unit==400|unit<600) {
        	 bill=unit*1.80;
         	 System.out.println(name+" customer with the id -"+n+" have to pay "+bill);
         }
         else  {
        	 bill=unit*2.00;
         	 System.out.println(name+" customer with the id-"+n+" have to pay "+bill);
         }
         num.close();
	}
}
