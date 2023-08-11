package Assignment;

import java.util.Scanner;

public class CoordinateSystem {
public static void main(String args[]) {
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the x.y values: ");
	int x=num.nextInt();
	int y=num.nextInt();
	if(x>0 & y>0&x!=0 &y!=0) {
		System.out.println("1st Quadrant");
	}
	else if(x<0&y>0&x!=0 &y!=0)
{
		System.out.println("2rd Quadrant");
}
	else if(x<0&y<0&x!=0 &y!=0) {
		System.out.println("3rd Quadrant");
	}
	else if(x>0&y<0 &x!=0 &y!=0){
		System.out.println("4th Quadrant");
	}
	else
		System.out.println("Origin point");
num.close();
}
}
