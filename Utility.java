package com.Bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Utility 
{ 

	public String FileRead(String name) throws IOException
	{
		FileReader fr = null;
		try 
		{
			 fr=new FileReader(name);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		BufferedReader br=new BufferedReader(fr);
		String line;
		String s="";
		
		while((line=br.readLine())!=null)
		{
			s=s+line+" ";
		}
			
		return s;
		
	}
	

	
	public int[] accept(int sizeArr) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[sizeArr];
		System.out.println("Enter "+sizeArr+" Integer");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	/**
	 * sort Integer Array
	 * @param intArr
	 * @return
	 */
	public int[] bubbleSort(int[] intArr)
	{
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
		return intArr;

	}

	/**
	 * sort String Array
	 * @param string array
	 * @return String array
	 */
	public String[] bubbleSort(String[] strArr)
	{
		for(int i = 0; i < strArr.length; i++) 
		{
		    for(int j = 0; j < strArr.length-1; j++) 
		    {
		        if(strArr[j].compareTo(strArr[j + 1]) > -1) 
		        {
		            String temp = strArr[j];
		            strArr[j] = strArr[j + 1];
		            strArr[j + 1] = temp;
		        }
		    }
		}
		
		return strArr;
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

	public int[] intgerConverter(String[] strArr)
	{
		int intArr[]=new int[strArr.length];
		
		for(int i=0;i<strArr.length;i++)
		{
			intArr[i]=Integer.parseInt(strArr[i]);
		}
		return intArr;
		
	}

	public float[] floatConverter(String[] strArr) 
	{
		float[] floatArr=new float[strArr.length];
		for(int i=0;i<strArr.length;i++)
		{
			floatArr[i]=Float.parseFloat(strArr[i]);
		}
		return floatArr;
	}

	public double[] doubleConverter(String[] strArr)
	{
		double[] doubletArr=new double[strArr.length];
		for(int i=0;i<strArr.length;i++)
		{
			doubletArr[i]=Float.parseFloat(strArr[i]);
		}
		return doubletArr;
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
	public int[] insertionSort(int[] intArr) 
	{
		for(int i=1;i<intArr.length;i++)
		{
			int j=i;
			while(j>0)
			{
				if(intArr[j-1]>intArr[j])
				{
					int temp=intArr[j-1];
					intArr[j-1]=intArr[j];
					intArr[j-1]=temp;
				}
				j--;
			}
		}
		return intArr;
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
	public double[] insertionSort(double[] doubleArr) 
	{
		for(int i=1;i<doubleArr.length;i++)
		{
			int j=i;
			while(j>0)
			{
				double temp=doubleArr[j-1];
				doubleArr[j-1]=doubleArr[j];
				doubleArr[j]=temp;
			}
			j--;
		}
		return doubleArr;
	}


	/**
	 * Insertion sort for String Array
	 * @param String Array
	 * @return String Array
	 */
	public String[] insertionSort(String[] strArr) 
	{
		return strArr;
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
