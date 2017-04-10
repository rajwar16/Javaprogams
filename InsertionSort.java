package com.Bridgelabz.javaPrograms;

import java.io.IOException;

import com.Bridgelabz.utility.Utility;

public class InsertionSort 
{
	public static void main(String[] args) throws IOException {
		Utility u=new Utility();
		String str=u.FileRead("input.txt");
		//System.out.println(str);
		String strArr[]=str.split(" ");
		/*	
		for(int i=0;i<strArr.length;i++)
		{
			System.out.println(strArr[i]);
		}
		*/
		
		int intArr[]=new int[strArr.length];
		
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=Integer.parseInt(strArr[i]);
		}
		
		System.out.println("Array before sort : ");
		u.display(intArr);
		
		for(int i=1;i<intArr.length;i++)
		{
			
			int j=i;
			while(j>0)
			{
				if(intArr[j-1]>intArr[j])
				{
					int temp=intArr[j-1];
					intArr[j-1]=intArr[j];
					intArr[j]=temp;
				}
				j--;
			}
		}
		System.out.println("Array After sort : ");
		u.display(intArr);
	}
}
