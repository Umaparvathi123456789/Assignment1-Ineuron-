       //Program to count noof vowels and consonents if given string
import java.util.Scanner; 
class Numberofvowelsandconsonents{
 public static void main(String arg[]){
 int vowels=0,consonents=0;
								//taking a sentence from user
 Scanner input=new Scanner(System.in); 
 System.out.println("Enter the sentence:");
 String str=input.nextLine();
								//converting into lowercase letters
  str=str.toLowerCase();
 for( int i=0;i<str.length();i++)
{ 
								//using if condition to check vowels
 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
{
 vowels=vowels+1;
}

else if(str.charAt(i)>='a' && str.charAt(i)<='z')
{
consonents=consonents+1;
}}
								//printing the count of vowels and consonents		
 System.out.println("no of vowels in string is:"+vowels);
 System.out.println("no of consonents in strinf is:"+consonents);
}}