package Assignment;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.println("enter the elements: ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		matrix[i][j]=sc.nextInt();
		
	}
}
System.out.println("matrix: ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(matrix[i][j]);
	}
	System.out.println();
}
System.out.println("sum of diagonals");
int sum=0;
for(int i=0;i<3;i++) {
	sum=sum+matrix[i][i];
}
System.out.print(sum);	

sc.close();
}}

