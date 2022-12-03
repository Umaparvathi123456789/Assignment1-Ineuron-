      //Progrma to check if the string is anagaram or not
import java.util.Arrays;
import java.util.Scanner;
class Anagram{
public static void main(String args[]){
							//taking input two stringsfrom user
 Scanner input1=new Scanner(System.in);
 System.out.println("Enter the frist string");
 String str1=input1.nextLine();
 Scanner input2=new Scanner(System.in);
 System.out.println("Enter the second string");
 String str2=input2.nextLine();
							//taling if condition to check whether the two string hava same length
 if(str1.length()==str2.length())
{
							//converting the two strings into character array
 char arr1[]=str1.toCharArray();																																																																																																
 char arr2[]=str2.toCharArray();
							//sorting the two strings
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 boolean result=Arrays.equals(arr1,arr2);
							//taking if condition to check whetehr two anagarms or not
 if(result)
{
 System.out.println("given strings are anagram");
}
 else
{
 System.out.println("not anagarm");
}}
  else{
System.out.println("given strings are not anagrams");
}}}
