package Assignment;
import java.util.Scanner;
public class RectangleCircleTriangle {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
	System.out.println("enter the customer choosen of number to know the area: ");
	int input=obj.nextInt();
		if(input!=4) {
		System.out.println("you can now choose the values");
	System.out.println("lenght1 ");
	int l1=obj.nextInt();
	System.out.println("length2 ");
	int l2=obj.nextInt();
	System.out.println("radious");
	int r=obj.nextInt();
	int result;
	float result1;
    float pie=3.14f;
	switch (input) {
	case 1:
		result=l1*l2;
		System.out.println("Area of Rectangle= "+result);
		break;
	case 2:
		result=2*r;
		result1=result*pie;
		System.out.println("Circumferance of circle= "+result1);
		break;
	case 3:
		result=r*r;
		result1=result*pie;
		System.out.println("Area of circle ="+result1);
		break;
	case 4:
		result=l1*l2;
		result1=1/2*result;
		System.out.println("Area of triangle= "+result1);
		break;
		default:
		System.out.println("you fetch the results");
	}
		}
	obj.close();
}}

