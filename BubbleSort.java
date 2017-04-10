package com.Bridgelabz.javaPrograms;

import java.io.IOException;

import com.Bridgelabz.utility.Utility;


public class BubbleSort 
{
	public static void main(String[] args) throws IOException {
		Utility u=new Utility();
		String str=u.FileRead("input.txt");
		
		String strArr[]=str.split(" ");
		
		int intArr[]=new int[strArr.length];
		
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=Integer.parseInt(strArr[i]);
		}
		u.display(intArr);
		
		for(int i=0;i<intArr.length;i++)
		{
			for(int j=0;j<intArr.length-1;j++)
			{
				if(intArr[j]>intArr[j+1])
				{
					int temp=intArr[j];
					intArr[j]=intArr[j+1];
					intArr[j+1]=temp;
				}
			}
		}
		u.display(intArr);
		
	}
}
