package com.Bridgelabz.javaPrograms;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
class PrimeFactor
{
	public static void main(String args[])
	{
		Set<Integer> hs = new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. ");
		int n=sc.nextInt();
		long Input=n; 
		for (int i = 2; i <= Input; i++)
		{ 
			if (Input % i == 0) 
			{ 
				hs.add(i); 
				Input /= i; 
				i--; 
			}
		}
		System.out.println(hs);

	}
}
