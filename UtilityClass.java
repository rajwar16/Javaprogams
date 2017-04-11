package com.Bridgelabz.javaPrograms;

import java.io.IOException;
import java.util.Scanner;


import com.Bridgelabz.utility.Utility;

public class UtilityClass 
{
	static Scanner sc=new Scanner(System.in);
	static Utility u=new Utility();

	public static void main(String[] args) throws IOException 
	{
		char choice;
		do
		{
			System.out.print("Enter the File Name : ");
			String fileName=sc.next();
			String str=u.FileRead(fileName);

			String strArr[]=str.split(" ");
			System.out.println();
			System.out.println("File Contains : ");
			u.display(strArr);
			System.out.println();

			System.out.println("******MENU******");
			System.out.printf("1.Bubble sort\n2.Insertion sort\n3.Binary Search\nEnter ur Choice : ");
			int ch=sc.nextInt();
			System.out.println();
			switch(ch)
			{
			case 1:	
				bubbleSort(strArr);
				break;
			case 2: 
				insertionSort(strArr);
				break;
			case 3:
				binarySearch(strArr);
			}
			System.out.print("DO u want to Continue plzz press y : ");
			choice=sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');
	}

	private static void binarySearch(String[] strArr) 
	{
		System.out.println("Which type of data u want Search: ");
		System.out.printf("1.Integer\n2.Float\n3.Double\n4.String\nEnter ur Choice : ");

		int Choice1 = sc.nextInt();
		switch(Choice1)
		{
		case 1:
			int[] intArr=u.intgerConverter(strArr);
			System.out.println("Array before sort: ");
			u.display(intArr);
			System.out.println();
			int[] sortArr=u.bubbleSort(intArr);
			System.out.println("Array after sort: ");
			u.display(sortArr);
			System.out.println();

			System.out.print("Enter which data u want to search : ");
			int intsearch=sc.nextInt();
			u.binarySearch(sortArr,intsearch);
			break;

		case 2: 
			float[] floatArr=u.floatConverter(strArr);
			System.out.println("Array before sort : ");
			u.display(floatArr);
			System.out.println();
			float[] sortFloat=u.bubbleSort(floatArr);
			System.out.println("Array After sort : ");
			u.display(sortFloat);
			System.out.println();

			System.out.print("Enter which data u want to search : ");
			float floatsearch=sc.nextFloat();
			u.binarySearch(sortFloat,floatsearch);
			break;

		case 3: 
			double[] doubleArr=u.doubleConverter(strArr);
			System.out.println("Array before sort : ");
			u.display(doubleArr);
			System.out.println();
			double[] sortDouble=u.bubbleSort(doubleArr);
			System.out.println("Array After sort : ");
			u.display(sortDouble);
			System.out.println();

			System.out.println("Enter Which data u want to search : ");
			double doubleSearch=sc.nextDouble();
			u.binarySearch(sortDouble, doubleSearch);
			break;

		case 4: 

			System.out.println("Array before sort : ");
			u.display(strArr);
			System.out.println();
			String[] sortString=u.bubbleSort(strArr);
			System.out.println("Array After sort : ");
			u.display(sortString);
			System.out.println();

			System.out.println("Enter Which data u want to search : ");
			String stringSearch=sc.next();
			u.binarySearch(sortString, stringSearch);
			break;
		}
	}

	private static void insertionSort(String[] strArr) 
	{
		System.out.println("Which type of data u want Sort: ");
		System.out.printf("1.Integer\n2.Float\n3.Double\n4.String\nEnter ur Choice : ");
		int Choice1 = sc.nextInt();
		switch(Choice1)
		{
		case 1:

			int[] intArr=u.intgerConverter(strArr);
			System.out.println("Array before sort: ");
			u.display(intArr);
			System.out.println();
			String[] sortArr=u.bubbleSort(strArr);
			System.out.println("Array after sort: ");
			u.display(sortArr);
			System.out.println();
			break;

		case 2: 
			float[] floatArr=u.floatConverter(strArr);
			System.out.println("Array before sort : ");
			u.display(floatArr);
			System.out.println();
			float[] sortFloat=u.bubbleSort(floatArr);
			System.out.println("Array After sort : ");
			u.display(sortFloat);
			System.out.println();
			break;

		case 3: 
			double[] doubleArr=u.doubleConverter(strArr);
			System.out.println("Array before sort : ");
			u.display(doubleArr);
			System.out.println();
			double[] sortDouble=u.bubbleSort(doubleArr);
			System.out.println("Array After sort : ");
			u.display(sortDouble);
			System.out.println();
			break;

		case 4: 

			System.out.println("Array before sort : ");
			u.display(strArr);
			System.out.println();

			String[] sortString=u.bubbleSort(strArr);

			System.out.println("Array After sort : ");
			u.display(sortString);
			System.out.println();
			break;
		}
	}


	protected static void bubbleSort(String[] strArr)
	{
		System.out.println("Which type of data u want Sort: ");
		System.out.printf("1.Integer\n2.Float\n3.Double\n4.String\nEnter ur Choice : ");
		int Choice = sc.nextInt();
		switch(Choice)
		{
		case 1:

			int[] intArr=u.intgerConverter(strArr);
			System.out.println("Array before sort: ");
			u.display(intArr);
			System.out.println();
			int[] sortArr=u.bubbleSort(intArr);
			System.out.println("Array after sort: ");
			u.display(sortArr);
			System.out.println();
			break;

		case 2: 
			float[] floatArr=u.floatConverter(strArr);
			System.out.println("Array before sort : ");
			u.display(floatArr);
			System.out.println();
			float[] sortFloat=u.bubbleSort(floatArr);
			System.out.println("Array After sort : ");
			u.display(sortFloat);
			System.out.println();
			break;

		case 3: 
			double[] doubleArr=u.doubleConverter(strArr);
			System.out.println("Array before sort : ");
			u.display(doubleArr);
			System.out.println();
			double[] sortDouble=u.bubbleSort(doubleArr);
			System.out.println("Array After sort : ");
			u.display(sortDouble);
			System.out.println();
			break;
		case 4: 

			System.out.println("Array before sort : ");
			u.display(strArr);
			System.out.println();
			String[] sortString=u.bubbleSort(strArr);
			System.out.println("Array After sort : ");
			u.display(sortString);
			System.out.println();
			break;
		}
	}
}
