package Assignment;
import java.util.Scanner;
public class Factorial{
	public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Ente the number: ");
	int num=obj.nextInt();
	int fact=1;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			fact=fact*i;
}
	}
	System.out.print(fact);
	obj.close();
	}}
	
