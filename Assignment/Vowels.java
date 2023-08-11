package Assignment;
import java.util.Scanner;
public class Vowels {
	public static void main(String arg[]) {
		Scanner string=new Scanner(System.in);
	     System.out.println("enter the string:");
		String str=string.next();
		//String str="UmaParvathi";
		char arr[]=str.toCharArray();
		for(int j=0;j<arr.length;j++) {
			char i=str.charAt(j);
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'|| i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
		  i=(char)((int)i-32);}
		 //System.out.print(Character.toUpperCase(str.charAt(i)));
	System.out.print(i);
		}
		string.close();
		}}