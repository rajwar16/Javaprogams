package com.Bridgelabz.javaPrograms;
import java.util.Scanner;

public class TofindYourNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int N=sc.nextInt();
		System.out.println("Assume No in between 0 to "+(N-1));
		System.out.println("are u assume? press yes");
		String str=sc.next();
		if(str.equalsIgnoreCase("yes"))
		{
			int high=N-1;
			int low=0;
			String choice;
			while(low<=high)
			{
				int mid=(low+high)/2;
				System.out.print("assume ur no is "+mid+". if yes press ok... :");
				System.out.println();
				System.out.print("if ur no is smaller than "+mid+" type true :");
				System.out.println();
				System.out.print("if ur no is greater than "+mid+" type false :");

				System.out.println();

				choice=sc.next();

				if(choice.equalsIgnoreCase("ok"))
				{
					System.out.println("yes got it ur No is "+mid);
					break;
				}
				else if(choice.equalsIgnoreCase("true"))
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		else
		{
			System.out.println("sorry u r not Assuming any No...");
		}

	}
}
