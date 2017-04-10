package com.Bridgelabz.javaPrograms;
import java.util.Scanner;

public class CouponNumbers 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char Userchoice;
		do
		{
			System.out.print("No of cards : ");
			int NoOfCards=sc.nextInt();

			int count=selectCoupon(NoOfCards);
			System.out.println(count);
			
			System.out.println("-----------------------------------------");
			System.out.println();
			
			System.out.print("do u want to continue plzzz press y :");
			Userchoice = sc.next().charAt(0);
		}while(Userchoice=='y' || Userchoice=='Y');
		
		System.out.println("program ended...");
	}

	private static int selectCoupon(int noOfCards) 
	{
		int count=0;
		int distinct=0;
		boolean selectCardArray[]=new boolean[noOfCards];
		while(distinct<noOfCards)
		{
			int value = getCoupon(noOfCards);
			count++;
			if(!selectCardArray[value])
			{
				distinct++;
				selectCardArray[value]=true;
			}
		}
		return count ;

	}

	private static int getCoupon(int noOfCards) 
	{
		int value=(int)(Math.random()*noOfCards);
		return value;
	}
}
