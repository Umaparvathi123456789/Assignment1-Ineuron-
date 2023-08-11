package Assignment;
import java.util.Scanner;
public class EmployeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Employee{
			Scanner sc=new Scanner(System.in);
			String empName=sc.nextLine();
			int empId=sc.nextInt();
			String designation=sc.nextLine();
			public void getEmployee() {
				System.out.println(empName);
				System.out.println(empId);
				System.out.println(designation);
			}}
		class EmployeeAdress{
			Scanner sc=new Scanner(System.in);
			int homeNum=sc.nextInt();
			String streetName=sc.nextLine();
			String cityName=sc.nextLine();
			int pincode=sc.nextInt();
			public void getEmpAdress() {
				System.out.println(streetName);
				System.out.println(cityName);
				System.out.println(pincode);
			}}
		class EmployeeContact{
			Scanner sc=new Scanner(System.in);
			long phoneNum=sc.nextLong();
			String mailId=sc.nextLine();
			public void getEmpContact() {
				System.out.println(phoneNum);
				System.out.println(mailId);
			}}
		class EmployeeSalary{
			Scanner sc=new Scanner(System.in);
			long basicSal=sc.nextLong();
			long totalSal=sc.nextLong();
			public long cal(long basicSal) {
				this.basicSal=totalSal-basicSal;
				return basicSal;
			}
			public void getEmpSalary() {
				System.out.println(basicSal);
				System.out.println(totalSal);
			}}
		}

	}

}
