package com.Bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utility 
{ 
	Scanner scanner=new Scanner(System.in);
	
	/**
	 * Accept integer Value
	 * @return Integer value
	 */
	public int intScanner() 
	{
		int integerNumber=scanner.nextInt();
		return integerNumber;
	}
	
	/**
	 * Accept float Value
	 * @return float value
	 */
	
	public float floatScanner()
	{
		float floatNumber=scanner.nextFloat();
		return floatNumber;
	}
	
	/**
	 * Accept String Value
	 * @return String value
	 */
	public String stringScanner()
	{
		String string=scanner.next();
		return string;
	}
	
	
	/**
	 * it read the file 
	 * @param String Filename
	 * @return String
	 * @throws IOException
	 */
	public String FileRead(String name) throws IOException
	{
		FileReader fileReader = null;
		try 
		{
			fileReader=new FileReader(name);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fileReader);
		String line;
		String string="";

		while((line=br.readLine())!=null)
		{
			string=string+line+" ";
		}

		return string;

	}



	/**
	 * Accept Integer input for Integer Array
	 * @param sizeArray
	 * @return
	 */
	public int[] accept(int sizeArray) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[sizeArray];
		System.out.println("Enter "+sizeArray+" Integer");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		scanner.close();
		return arr;
	}
	
	/**
	 * sort Integer Array
	 * @param intArr
	 * @return
	 */
	public int[] bubbleSort(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=0;j<intArray.length-1;j++)
			{
				if(intArray[j]>intArray[j+1])
				{
					int temp=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}
			}
		}
		return intArray;
	}

	/**
	 * sort String Array
	 * @param string array
	 * @return String array
	 */
	public String[] bubbleSort(String[] strArray)
	{
		for(int i = 0; i < strArray.length; i++) 
		{
			for(int j = 0; j < strArray.length-1; j++) 
			{
				if(strArray[j].compareTo(strArray[j + 1]) > -1) 
				{
					String temp = strArray[j];
					strArray[j] = strArray[j + 1];
					strArray[j + 1] = temp;
				}
			}
		}

		return strArray;
	}

	/**
	 * bubble sort for character String
	 * @param character String
	 * @return
	 */
	public char[] bubbleSort(char[] charStr1) {
		for(int i = 0; i < charStr1.length; i++) 
		{
			for(int j = 0; j < charStr1.length-1; j++) 
			{
				if(charStr1[j]==charStr1[j + 1]) 
				{
					char temp = charStr1[j];
					charStr1[j] = charStr1[j + 1];
					charStr1[j + 1] = temp;
				}
			}
		}

		return charStr1;

	}

	/**
	 * sort float Array
	 * @param float array
	 * @return float array
	 */
	public float[] bubbleSort(float[] floatArr) 
	{
		for(int i=0;i<floatArr.length;i++)
		{
			for(int j=0;j<floatArr.length-1;j++)
			{
				if(floatArr[j]>floatArr[j+1])
				{
					float temp=floatArr[j];
					floatArr[j]=floatArr[j+1];
					floatArr[j+1]=temp;
				}
			}
		}
		return floatArr;
	}

	/**
	 * bubble sort for Double Array
	 * @param double Array
	 * @return
	 */
	public double[] bubbleSort(double[] doubleArr) 
	{
		for(int i=0;i<doubleArr.length;i++)
		{
			for(int j=0;j<doubleArr.length-1;j++)
			{
				if(doubleArr[j]>doubleArr[j+1])
				{
					double temp=doubleArr[j];
					doubleArr[j]=doubleArr[j+1];
					doubleArr[j+1]=temp;
				}
			}
		}
		return doubleArr;
	}

	/**
	 * convert String Array into Integer Array
	 * @param string Array
	 * @return integer Array
	 */
	public int[] intgerConverter(String[] stringArray)
	{
		int intArray[]=new int[stringArray.length];

		for(int i=0;i<stringArray.length;i++)
		{
			intArray[i]=Integer.parseInt(stringArray[i]);
		}
		return intArray;

	}
	
	/**
	 * convert String Array into Float Array
	 * @param string Array
	 * @return integer Array
	 */
	public float[] floatConverter(String[] stringArray) 
	{
		float[] floatArr=new float[stringArray.length];
		for(int i=0;i<stringArray.length;i++)
		{
			floatArr[i]=Float.parseFloat(stringArray[i]);
		}
		return floatArr;
	}

	/**
	 * convert String Array into double Array
	 * @param string Array
	 * @return integer Array
	 */
	public double[] doubleConverter(String[] strArr)
	{
		double[] doubleArray=new double[strArr.length];
		for(int i=0;i<strArr.length;i++)
		{
			doubleArray[i]=Float.parseFloat(strArr[i]);
		}
		return doubleArray;
	}

	/**
	 * Display Integer Array
	 * @param Intger array
	 */
	public void display(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	/**
	 * Display String Array
	 * @param String array
	 */
	public void display(String[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	/**
	 * Display FLoat Array
	 * @param Float array
	 */
	public void display(float[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}


	/**
	 * Display double Array
	 * @param Double array
	 */
	public void display(double[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	/**
	 * Display Character Array
	 * @param Character array
	 */
	public void display(char[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Insertion sort for Integer Array
	 * @param Integer Array
	 * @return Integer Array
	 */
	public int[] insertionSort(int[] intArray) 
	{
		for(int i=1;i<intArray.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(intArray[j-1]>intArray[j])
				{
					int temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j-1]=temp;
				}
				j--;
			}
		}
		return intArray;
	}

	/**
	 * Insertion sort for float Array
	 * @param float Array
	 * @return float Array
	 */
	public float[] insertionSort(float[] floatArr) 
	{
		for(int i=1;i<floatArr.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(floatArr[j-1]>floatArr[j])
				{
					float temp=floatArr[j-1];
					floatArr[j-1]=floatArr[j];
					floatArr[j]=temp;
				}
				j--;
			}
		}
		return floatArr;
	}


	/**
	 * Insertion sort for double Array
	 * @param double Array
	 * @return double Array
	 */
	public double[] insertionSort(double[] doubleArray) 
	{
		for(int i=1;i<doubleArray.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(doubleArray[j-1]>doubleArray[j])
				{
					double temp=doubleArray[j-1];
					doubleArray[j-1]=doubleArray[j];
					doubleArray[j]=temp;
				}
				j--;
			}
		}
		return doubleArray;
	}


	/**
	 * Insertion sort for String Array
	 * @param String Array
	 * @return String Array
	 */
	public String[] insertionSort(String[] stringArray) 
	{
		return stringArray;
	}

	public void binarySearch(int[] sortArr, int search) 
	{
		boolean flag=false;
		int low=0;
		int high=sortArr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(search==sortArr[mid])
			{
				System.out.println("Intger is Found at "+mid+" index.");
				flag=true;
				break;
			}
			else if(search<sortArr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(flag==false)
		{
			System.out.println("sorry Integer is Not Found...");
		}
	}

	/**
	 * Binary Search for Float Arrray
	 * @param Float Array
	 * @param float variable
	 */
	public void binarySearch(float[] sortFloat, float floatsearch) 
	{

		boolean flag=false;
		int low=0;
		int high=sortFloat.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(floatsearch==sortFloat[mid])
			{
				System.out.println("Intger is Found at "+mid+" index.");
				flag=true;
				break;
			}
			else if(floatsearch<sortFloat[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(flag==false)
		{
			System.out.println("sorry Integer is Not Found...");
		}
	}

	public void binarySearch(double[] sortDouble, double doubleSearch)
	{

		boolean flag=false;
		int low=0;
		int high=sortDouble.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(doubleSearch==sortDouble[mid])
			{
				System.out.println("Intger is Found at "+mid+" index.");
				flag=true;
				break;
			}
			else if(doubleSearch<sortDouble[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(flag==false)
		{
			System.out.println("sorry Integer is Not Found...");
		}
	}



	public void binarySearch(String[] sortString, String stringSearch) 
	{
		boolean flag=false;
		int low=0;
		int high=sortString.length-1;

		while(low<=high)
		{
			int mid=(low+high)/2;
			if(sortString[mid].equalsIgnoreCase(stringSearch))
			{
				System.out.println("Word is found at index "+mid);
				flag=true;
				break;
			}
			else if(stringSearch.compareTo(sortString[mid])>0)
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
