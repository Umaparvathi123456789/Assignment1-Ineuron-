package test;

public class StudentResult {
	
	public int totalMarks;
	public float per;
	public String result;
	
	public void calculate(int p,int totalMarks) {
		this.totalMarks=totalMarks;
		 per =totalMarks/6;
		
		if(per>=90) {
			result ="A Gread";
		}else if(per>=70) {
			result = "B Gread";
		}else if (per >=50) {
			result = "C  Gread";
		}else if(per >=35) {
			result = "d Gread";
		}else {
			result = "Fail";
		}
		
		if(0<p) {
			result ="Fail";
		}
	}

	public void getStuResults() {
		
		System.out.println("===Student Results =======");
		System.out.println("Student Total Marks : "+totalMarks);
		System.out.println("Student Percentage : "+per);
		System.out.println("Student Results : "+result);
		
	}
}
