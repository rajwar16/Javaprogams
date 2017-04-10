package com.Bridgelabz.javaPrograms;
import java.util.Scanner;
class Hello
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char d;
		do
		{
			System.out.println("Enter ur Name");
			String name=sc.next();
			System.out.println("Hello "+name+" how r u...");
			System.out.println("Do u want to continue press y if press any character...");
			d=sc.next().charAt(0);
			if(d!='y'||d!='Y')
			{
				System.out.println("Thank u...");
				System.exit(0);
			}
		}while(d=='y'||d=='Y');
	}
}
