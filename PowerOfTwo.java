package com.Bridgelabz.javaPrograms;
import java.util.Scanner;
class PowerOfTwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0; 
		char ch;
		do
		{
		System.out.println("Enter the range upto 0 to 30...");
		n=sc.nextInt();
		if(n<=30)
		{
			for(int i=0;i<30;i++)
			{
				System.out.println(i+" = "+Math.pow(2,i));
			}
		}
		System.out.println("Do u want Continue..press y ...");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
	}
}
