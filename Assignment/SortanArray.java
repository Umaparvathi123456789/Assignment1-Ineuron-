package Assignment;
public class SortanArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[]{2,4,1,5,7,4,5};
for(int i=0;i<=arr.length-1;i++) {
	for(int j=i+1;j<=arr.length-1;j++) {
		int temp;
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
System.out.print(+arr[i]);
	}
	}
}
