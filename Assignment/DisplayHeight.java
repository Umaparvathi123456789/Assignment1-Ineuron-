package Assignment;
import java.util.Scanner;
public class DisplayHeight {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the Height of person: ");
		int height=num.nextInt();
		if(height<150 ) {
			System.out.println("DWARFT");
		}
		else if(height<165 &height>150 |height==165 | height==150) {
			System.out.println("AVERAGE HEIGHT");
		}
		else if(height>165)
		{
			System.out.println("TALL");
	
		}
		num.close();
	}
	}