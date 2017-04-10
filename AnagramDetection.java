package com.Bridgelabz.javaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("enter first String : ");
		String str1=sc.next();
		System.out.print("Enter Second String : ");
		String str2=sc.next();
		
		
		char[] charStr1=str1.toCharArray();
		char[] charStr2=str2.toCharArray();

		Arrays.sort(charStr1);
		Arrays.sort(charStr2);
		for(int i=0;i<charStr1.length;i++)
		{
			System.out.print(charStr1[i]);
		}
		
		for(int i=0;i<charStr2.length;i++)
		{
			System.out.print(charStr2[i]);
		}
		
		System.out.println();
		if(charStr1.length==charStr2.length)
		{
			for(int i=0;i<charStr1.length;i++)
			{
				if(charStr1[i]==charStr2[i])
				{
					flag=true;
				}
				else
				{
					flag=false;
					break;
				}
			}
		}
		
		if(flag)
		{
			System.out.println("Strings are anagram...");
		}
		else
		{
			System.out.println("not anagram..");
		}
		/*
		char temp;
		for(int i=0;i<charStr1.length;i++)
		{
			for(int j=0;j<charStr1.length-1;i++)
			{
				temp=charStr1[j];
				charStr1[j]=charStr1[j+1];
				charStr1[j+1]=temp;
			}
		}*/
	}
}
