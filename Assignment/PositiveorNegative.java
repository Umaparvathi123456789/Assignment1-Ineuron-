package Assignment;
import java.util.Scanner;
public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1=num.nextInt();
		if (num1==0){
			System.out.println("Neither Positive or Negative Number");
		}
			else if(num1>0)
			{
				System.out.println("Positive Number");
			}
			else {
				System.out.println("Negative Number");
			}
        num.close();
	}

}
