package Assignment;
import java.util.Scanner;
public class ReverseString {
	public static void main(String ar[]) {
		Scanner str=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1=str.next();
		String str2=new String(str1);
	    char[] arr=str2.toCharArray();
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			//for(int j=0;j<=i;j++)
	//		for(int)
			//for(int j=i)
			//for(int j=i;j<)
	      rev=rev+str2.charAt(i);
		}
		System.out.print(rev);
		str.close();
		/*String name="Uma";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);	*/
}}
