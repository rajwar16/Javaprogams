package com.Bridgelabz.javaPrograms;
import java.util.Scanner;
import java.lang.Math;
class CoinFlip
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char choice;		

		do
		{
		System.out.print("How many time u want to Flip the coin :");
		int n=sc.nextInt();
		int head =0;
		int tail =0;
		
		for(int i=0;i<n;i++)
		{
			if(Math.random() < 0.5)
			{
				tail=tail+1;
			}
			else
			{
				head=head+1;
			}
		}

		System.out.println("total No of head is : "+head);
		System.out.println("Total No of tail is : "+tail);

		System.out.println("Do u want to Continue press y : ");
		choice=sc.next().charAt(0);
		
		}while(choice=='y'||choice=='Y');
		System.out.println("End the Program");
	}

}
