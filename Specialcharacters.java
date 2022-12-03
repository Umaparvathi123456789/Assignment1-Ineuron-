    //Program to print special characters of given string
import java.util.Scanner;
class Specialcharacters{
public static void main(String args[]){
						//taling input sentence from user
 Scanner input=new Scanner(System.in);
 System.out.println("Enter the senctence:");
 String str=input.nextLine();
						//converting into chararray
char[] sentence=str.toCharArray();
						//declaring variables to count
int number=0,spaces=0,character=0,other=0;
 for(int i=0;i<sentence.length;i++) {
						//taking if condtion to count numbers
 if(Character.isDigit(sentence[i])) {
 number++;
}
 						//taking if condtion to count spaces
 if(Character.isSpaceChar(sentence[i])) {
spaces++;
}
						//taking if condition to count characters
 if(Character.isLetter(sentence[i])) {
 character++;
}
else {
other++;
}}
						//printing the all special characters
System.out.println("Number: "+number);
System.out.println("spaces: "+spaces);
System.out.println("Alaphabets: "+character);
System.out.println("Other speical charasters: "+other);
}}
