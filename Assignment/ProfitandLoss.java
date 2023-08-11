package Assignment;

import java.util.Scanner;

public class ProfitandLoss {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the cost price: ");
		int cp=num.nextInt();
		System.out.println("Enter the selling price: ");
		int sp=num.nextInt();
		int loss;
		int profit;
		if(cp<sp) {
			profit=sp-cp;
			System.out.println(profit+" Rupees Profit");
		}
		else if(cp>sp)
			{
			loss=cp-sp;
				System.out.println(loss+" Rupees Loss");
			}
		else {
			System.out.println("No Profit and Loss");
		}
        num.close();
	}
	}
