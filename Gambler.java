package com.Bridgelabz.javaPrograms;
import java.util.Scanner;

public class Gambler 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Stake :");
		int stake=sc.nextInt();
		System.out.print("Enter goal : ");
		int goal=sc.nextInt();
		System.out.print("No of Trials :");
		int trials=sc.nextInt();
		
		int bets=0;
		int win=0;
		int loss=0;
		
		for(int i=0;i<trials ;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;
				else
					cash--;
			}
			if(cash==goal)
				win++;
			else
				loss++;
		}
		System.out.println(win+" win of "+trials);
		System.out.println("Percentage of wins : "+(100.0*win/trials));
		System.out.println("Average bets : "+(1.0*bets/trials));
	}
}
