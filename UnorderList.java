package com.Bridgelabz.javaPrograms;

import java.io.IOException;
import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

public class UnorderList 
{
	Node start;
	Node head;
	Node nextNode;
	
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		UnorderList uol=new UnorderList();
		String str="";
		
		System.out.print("Enter the file name : ");
		String name=scanner.next();
		try 
		{
			str=utility.FileRead(name);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("File contains : ");
		System.out.println(str);
		
		String strArr[]=str.split(" ");
		
		int[] intArr=utility.intgerConverter(strArr);
		
		for(int i=0;i<intArr.length;i++)
		{
			uol.addData(intArr[i]);
		}
		
		uol.display();
		
		System.out.println("Enter the data which u want to search : ");
		int search=scanner.nextInt();
		uol.search(search);
		scanner.close();
		
	}

	protected void search(int search) 
	{
		boolean flag=false;
		int count=0;
		Node temp=start;
		while(temp.nextNode!=null)
		{
			count++;
			
			if(temp.data==search)
			{
				System.out.println("data is found at Node "+count);
				flag=true;
				remove(count);
				display();
				break;
			}
			temp=temp.nextNode;
		
		}
		System.out.println(count);
		if(flag==false)
		{
			System.out.println("Sorry data is Not found...");
			System.out.println("Data is added at Node ");
			addData(search);
			display();
		}
		
	}

	private void remove(int count) 
	{
		
		Node temp=start;
		int travels=1;
		while(travels<count-1)
		{
			
			temp=temp.nextNode;
			travels++;
		}
		temp.nextNode=temp.nextNode.nextNode;
	}

	protected void display() 
	{
		Node temp=start;
		while(temp.nextNode!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.nextNode;
		}
		System.out.println(temp.data);
	}

	protected void addData(int i) 
	{
		head=start;
		Node temp=new Node();
		temp.data=i;
		temp.nextNode=null;
		if(start==null)
		{
			start=temp;
		}
		else
		{
			while(head.nextNode!=null)
			{
				head=head.nextNode;
			}
			head.nextNode=temp;
			 
		}
		
	}
}
