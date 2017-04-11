package com.Bridgelabz.javaPrograms;
import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year=0;
		char choice;
		do
		{
		try
		{
			System.out.println("Enter the Year : ");
			year=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("This is not the Year");
			break;	
		}
		
		if(year/1000>=1 && year/1000<=9)
		{
			if(year%4==0 || year%400==0 && year%100!=0)
			{
				System.out.println("Leap year");
			}

			else
			{
				System.out.println("year is not Leap year.");
			}
			
		}
		else
		{
			System.out.println("No Should be in 4 digit : ");
		}

		System.out.print("Do u want to continue press y: ");
		choice=sc.next().charAt(0);
			
		}while(choice=='y' || choice=='Y');
		System.out.println("thank u...");
		
	}
}
