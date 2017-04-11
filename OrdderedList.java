package com.Bridgelabz.javaPrograms;

import java.io.IOException;
import java.util.Scanner;

import com.Bridgelabz.utility.Utility;

/**
 * it create a Order List
 * @author bridgeit
 *
 */
public class OrdderedList {
	Node head, start;

	public static void main(String[] args) throws IOException {
		Utility utility=new Utility();
		OrdderedList orderList=new OrdderedList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the File Name : ");
		String fileName=scanner.next();
		
		String string=utility.FileRead(fileName);
		System.out.println(string);
		
		String[] stringArray=string.split(" ");
		int[] intArray=utility.intgerConverter(stringArray);
		
		int sortArray[]=utility.bubbleSort(intArray);
		utility.display(sortArray);
		
		for(int i=0;i<sortArray.length;i++)
		{
			orderList.addData(sortArray[i]);
		}
		orderList.display();
		System.out.print("Enter the data Which u want to search : ");
		int search=scanner.nextInt();
		orderList.searchData(search);
		
		scanner.close();
	}
	

	protected void searchData(int search){
		Node temp=start;
		int count=0;
		boolean flag=false;
		while(temp.nextNode!=null){
			count++;
			if(temp.data==search)
			{
				System.out.println("data is found at Node "+count);
				remove(count);
				display();
				flag=true;
				break;
			}
			temp=temp.nextNode;
		}
		if(flag==false)
		{
			System.out.println("Sorry data is not found ...");
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


	protected void display() {
		Node temp = start;
		while (temp.nextNode != null) {
			System.out.print(temp.data + "-->");
			temp = temp.nextNode;
		}
		System.out.println(temp.data);
	}

	protected void addData(int i) {
		head = start;
		Node temp = new Node();
		temp.data = i;
		temp.nextNode = null;
		if (start == null) {
			start = temp;
		}

		else {
			while (head.nextNode != null) {
				head = head.nextNode;
			}
			head.nextNode = temp;
		}

	}
}
