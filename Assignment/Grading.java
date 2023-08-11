package Assignment;
import java.util.Scanner;
public class Grading {
	public static void main(String args[]) {
		int total;
	    float per;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the name of the student: ");
		String name=obj.nextLine();
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the roll number of the student:");
		int n=obj1.nextInt();
		System.out.println("enter the maths marks:");
		int math=obj1.nextInt();
		System.out.println("enter the physics marks:");
		int phy=obj1.nextInt();
		System.out.println("enter the chemistry marks:");
		int chem=obj.nextInt();
		total=math+phy+chem;
		System.out.println(name+" total marks:"+total);
		per=total/3f;
		System.out.println("percentage of "+per);
	   if(per>=65) {
		   System.out.println(name+ " with the roll number "+n+" First");
	    }
	    else if(per<60 & per>=48)
	    {
	    	System.out.println(name+ " with the roll number "+n+" Second");
	    }
	    else if(per>=36)
	    {
	    	System.out.println(name+ " with the roll number "+n+" Pass");
	    }
	    else
	    	System.out.println(name+ " with the roll number "+n+" Fail");
	   obj.close();
	   obj1.close();
	}}

