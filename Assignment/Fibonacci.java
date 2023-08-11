package Assignment;

public class Fibonacci {
	public static void main(String arg[]) {
		int a=0,b=1,fibnoanci;
		System.out.println("Finoanci series 1 to 100 is :");
		while(a<=100){
			System.out.print(a+",");
			fibnoanci=a+b;
			a=b;
			b=fibnoanci;
			
			
		}
	}
	}

