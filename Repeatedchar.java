    // program to print repeated characters in given string
import java.util.Scanner;
class Repeatedchar{
public static void main(String args[]) {
						//taking the input from user
Scanner input=new Scanner(System.in);
System.out.println("Enter the string:");
String str=input.nextLine();
						//length of the given string
int length=str.length();
						//converting string into a character array
 char[] arr=str.toCharArray();
 for(int i=0;i<length;i++) {
 int count=1;
  for(int j=i+1;j<length;j++) {
 
						//checking the elements of string
   if(arr[i]==arr[j]) {
count++;
}
						//taking if condition to check the repeated character
if(count==2)
{
	System.out.println("repeated charaters of given string:- "+arr[j]);
break;
}}}
}}