    // Progrma to check if the string is panagram or not
import java.util.Scanner;
class Panagram{
public static void main(String args[]){
								//taking the sentence from input
 Scanner input=new Scanner(System.in);
 System.out.println("Enter the sentence:");
 String str=input.nextLine();
  System.out.println(isPanagram(str.toLowerCase()));
}
								//taking boolean data type to check whether the sentence is panagram or not
public static boolean isPanagram(String str) {
								//checking whether the sentence consists of 26 alphabets 
if(str.length()<26)
{
								//return false if the sentence is not panagarm
 return false;
}
else
{
 for(char ch='a';ch<'z';ch++)
{
 if(str.indexOf(ch)<0) {
 return false;
}}}
								//return if the sentsnce is panagram 
 return true;
}}
