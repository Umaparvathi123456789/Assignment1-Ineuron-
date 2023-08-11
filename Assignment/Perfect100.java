package Assignment;
public class Perfect100 {
	public static void main(String[] args) {
		int num=100;
				for(int i=1;i<num;i++) {
					int sum=0;
					for(int j=1;j<i;j++)
					{
					if(i%j==0) {
						sum=sum+j;
					}}
					if(sum==i) 
						System.out.println(i+" =perfect number between 1 to 100");
					}}
		}


