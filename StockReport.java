
package com.Bridgelabz.javaPrograms;

import java.util.Scanner;

public class StockReport 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many Company details are : ");
		int n=sc.nextInt();
		Company comDetails[]=new Company[n];
		for(int i=0;i<comDetails.length;i++)
		{
			System.out.print("Enter Company Name : ");
			String name=sc.next();
			System.out.print("Enter No Of Share : ");
			int noOfShare=sc.nextInt();
			System.out.print("Enter Share Price : ");
			float sharePrice=sc.nextFloat();
			comDetails[i]=new Company(name, noOfShare, sharePrice);
		}
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("comp Name\tShare\tPrice\t total value of Stock");
		for(int i=0;i<comDetails.length;i++)
		{
			float totalPrice=comDetails[i].noOfShare*comDetails[i].sharePrice;
			System.out.println(comDetails[i].compName+"\t"+comDetails[i].noOfShare+"\t"+comDetails[i].sharePrice+"\t"+totalPrice);
		}
	}

}
