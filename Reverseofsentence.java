      // Program to print reverse of words of a given string
class Reverseofsentence{
public static void main(String arg[]){
String str="Thick Twice";
				 	 		// converting string into lowercase letters
 str=str.toLowerCase();
                                	 		// spliting of string into charcter
 String[] words=str.split(" ");
 String reverseofstring="";                             // reverse of words into reversed word
 for(int i=0;i<words.length;i++) {
 String word=words[i];
 String revword="";

 for(int j=word.length()-1;j>=0;j--) {
 revword=revword+ word.charAt(j);
}
                                  			 //reverse of string words is 
 reverseofstring=reverseofstring +revword+" ";
}
 System.out.println(reverseofstring);
}
}