package com.Bridgelabz.javaPrograms;
import java.util.Random;
import java.util.Scanner;
class CoinFlip2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random r = new Random();
		int head=0;
		char choice;

		do
		{
		System.out.print("How many time u want to Flip the coin :");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int side=r.nextInt(2);
			if(side==1)
			{
				head++;
			}
		}
		System.out.println("Head count: "+head);
		System.out.println("tail count: "+(num-head));

		System.out.println("Do u want to Continue press y : ");
		choice=sc.next().charAt(0);

		}while(choice=='y'||choice=='Y');
		
		System.out.println("End the Program");
	}
}
