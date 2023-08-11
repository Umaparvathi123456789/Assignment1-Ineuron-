package Assignment;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Temperature: ");
        int n=obj.nextInt();
        	if(n<0) 
        		 System.out.println(" Freezing temperature ");
        		 else if(n<10)
           System.out.println("Very Cold Whether");    
        		 else if(n<20)
        	 System.out.println(" Normal temperature");
        		 else if(n<40) 
        	 System.out.println("Hot Temperature");
        	else
        		System.out.println("Very Hot");
obj.close();
}}