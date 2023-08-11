package Assignment;
import java.util.Scanner;
public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number : ");
	int num=obj.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
	if(num%i==0) {
		count=count+1;
	}}
	if(count==2) {
		System.out.println("prime number");
	}
	else {
		System.out.println("not prime number");
	}
	
	obj.close();
}}