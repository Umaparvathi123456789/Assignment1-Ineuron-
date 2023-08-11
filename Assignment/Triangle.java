package Assignment;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the angles of a triangle are: ");
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		if(a==b & b==c) {
		System.out.println("it is a Eqalateral triangle");}
		else if(b==c& b>a &c>a) {
		System.out.println("it is a Isoscales triangle");}
		else {
		System.out.println("it is a Scalene triangle");
	}
	num.close();
	}
	}