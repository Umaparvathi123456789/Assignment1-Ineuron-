package Assignment;

public class Duplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[]{401,403,409,403,453,402,438,401,403,403,444};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				int temp;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}}
		System.out.print(arr[i]+",");
		}
		//System.out.println();
		System.out.println("Array in Decending order");
		System.out.println("Duplicate elements in array: ");
		for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[j]+",");
				break;
				}
				}}}}
