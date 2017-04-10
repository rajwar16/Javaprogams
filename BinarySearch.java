package com.Bridgelabz.javaPrograms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class BinarySearch 
{
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		boolean flag=false;
		String str=u.FileRead("input.txt");
		System.out.println(str);
		str=str.replaceAll("/n", " ");
		str=str.trim();
		String[] strArr=str.split(" ");
		Arrays.sort(strArr);
		
		//System.out.println(Integer.parseInt(strArr[0]));
		for(int i=0;i<strArr.length;i++)
		{
		
			System.out.println(strArr[i]);
		}
		System.out.println("Enter the String which u want to find : ");
		String search=sc.next();
		
		int low=0;
		int high=strArr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(strArr[mid].equalsIgnoreCase(search))
			{
				System.out.println("Word is found at index "+mid);
				flag=true;
				break;
			}
			else if(search.compareTo(strArr[mid])>0)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("sorry Word is Not found in File....");
		}
	}
}
