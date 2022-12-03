         // Program to sort the string into alphabetical order
import java.util.Scanner;
class Sortofstring{
 public static void main(String arg[]){
						//taking a string from user

 Scanner input=new Scanner(System.in);
 System.out.println("Enter the string");
 String str=input.nextLine();
						//converting into lower case letter using method
 str=str.toLowerCase();
						// converting into char array list using method
 char arr[]=str.toCharArray();
 char temp;
 for(int i=0;i<arr.length;i++) {
  for(int j=i+1;j<arr.length;j++) {
						//taking if condition 	
  if(arr[i]>arr[j]) {
  temp=arr[i];
  arr[i]=arr[j];
  arr[j]=temp; 
}}}
System.out.println(new String(arr));
}}
 
