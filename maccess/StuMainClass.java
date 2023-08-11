package maccess;


import java.util.Scanner;

import test.Display;
import test.Read;
import test.Student;

public class StuMainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		Read r = new Read();
		r.read(sc,stu);
		
		Display d = new Display();
		d.dis(stu);
		
	}

}
