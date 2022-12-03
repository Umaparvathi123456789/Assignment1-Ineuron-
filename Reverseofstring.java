    // Program to reverse the given string
class Reverseofstring{
 public static void main(String arg[]){
					  //taking a string
 String str="INeuron";
                                	  // spliting of string into words
 String[] words=str.split(" ");
 String reverseofstring="";
                                	 // reverse of words into reversed word
 for(int i=0;i<words.length;i++) {
 String word=words[i];
 String revword="";

 for(int j=word.length()-1;j>=0;j--) {
					 //reversing the string
 revword=revword+ word.charAt(j); 
}
 System.out.println(revword);
}
}}