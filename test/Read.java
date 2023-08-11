package test;

import java.util.Scanner;

public class Read {
	public void read(Scanner sc,Student stu) {
		
		System.out.println("Enter Student Name");
         stu.stuName = sc.nextLine();
         System.out.println("Enter the branch");
         stu.branch=sc.nextLine().toUpperCase();
         
         CheckBranch cb = new CheckBranch();
         boolean k = cb.verify(stu.branch);
         
         if(k) {
        	 
        	 System.out.println("Eneter the Roll No");
        	 stu.rollNo =sc.nextLine();
        	 
        	 if(stu.rollNo.length()==6) {
        		 
        		 System.out.println("Enter House No");
                 stu.sa.hNo = sc.nextLine();
                 System.out.println("Enter state Name");
                 stu.sa.sName = sc.nextLine();
                 System.out.println("Enter city Name");
                 stu.sa.city = sc.nextLine();
                 System.out.println("Enter pincode Name");
                 stu.sa.pincode = sc.nextInt();
                 System.out.println("Enter Email Name");
                 stu.sc.mail=sc.nextLine();
                 System.out.println("Enter Phone No");
                 stu.sc.phoneNo = sc.nextLong();
                 
                 
                 System.out.println("Enter 6 subject Marks");
                 int i=1,totalMarks=0,f=0;
                 while(i<=6) {
                	 System.out.println("Enter Marks of sub "+i);
                	 int sub = sc.nextInt();
                	 i++;
                	 if(0<=sub && sub<=100) {
                		 if(sub<=35) {
                			 f++;
                		 }
                		 totalMarks = totalMarks+sub;
                	 }else {
                		 System.out.println("Invalid marks");
                		 i--;
                		 continue;
                		 
                	 }
                	
                 }
        		 
                 stu.sr.calculate(f,totalMarks);
        	 }else {
        		 System.out.println("Invalid Roll NO");
        		 System.exit(0);
        		 
        	 }
        	
         }else {
        	 System.out.println("Invalid Branch");
        	 System.exit(0);
         }
	
		
	}

}
