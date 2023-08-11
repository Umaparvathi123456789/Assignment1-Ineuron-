package test;

 public class Student {
	
	 String stuName,branch,rollNo;
	
	StudentResult sr = new StudentResult();
	StudentAddress sa= new StudentAddress();
	StudentContact sc = new StudentContact();
	
	public void getStudent() {
		System.out.println("======Student Details=====");
		System.out.println("Student Name : "+stuName);
		System.out.println("Student Branch : "+branch);
		System.out.println("Student Roll No : "+rollNo);
		
	}

}
