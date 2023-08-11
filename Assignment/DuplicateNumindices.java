package Assignment;

public class DuplicateNumindices {
	public static void main(String arg[]) {
		int[] arr=new int[]{2,4,1,5,7,88,8,8,8,8,8,7,5,232,343,432,543,543,23,43,23};
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {			
				if(arr[i]==arr[j]) {
				System.out.println(/*"Duplicate numbers indices "*/i);
				break;
				
			}}}}}