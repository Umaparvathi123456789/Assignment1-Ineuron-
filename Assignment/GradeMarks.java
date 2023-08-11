package Assignment;
import java.util.Scanner;
public class GradeMarks {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the grade of a Student: ");
		char grade=obj.next().charAt(0);
		switch (grade){
			case'E':
			System.out.println("Excellent");
			break;
			case'V':
			System.out.println("Very Good");
			break;
			case'G':
			System.out.println("Good");
			break; 
			case'A':
			System.out.println("Average");
			break;
			default:
				System.out.println("Fail");
		}
		obj.close();
}}
