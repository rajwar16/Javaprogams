package com.Bridgelabz.javaPrograms;

import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class Sumof3Integer 
{
 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		boolean flag=false;
		char choice;
		do
		{
		System.out.print("enter size of Array : ");
		int sizeArr=sc.nextInt();
		int array[]=u.accept(sizeArr);
		u.display(array);
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if((array[i]+array[j]+array[k])==0)
					{
						System.out.println("Sum of[ "+array[i]+" "+array[j]+" "+array[k]+"] is Zero Found at index "+i+", "+j+", "+k);
						flag=true;
					}
				}
			}
		}
		if(flag==false)
		{
			System.out.println("soryy...There is no three no which has sum of Zero....");
		}
		
		System.out.print("Do u want to continue...plzz press y : ");
		choice=sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		
		System.out.println("Program ended...");
		sc.close();
	  
	}
}
