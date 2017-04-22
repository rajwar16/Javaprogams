package com.Bridgelabz.personAddressBook.Tester;

import java.util.Scanner;

import com.Bridgelabz.personAddressBook.controller.Service;

public class TestAddressBook 
{
	public static void main(String[] args) 
	{
		char decision;
		String bookName;
		Scanner scanner=new Scanner(System.in);
		Service service=new Service();

		do{
			System.out.println("************MENU************");
			System.out.println("1.create Address Book\n2.Add person\n3.Display person\n4.Edit a Person\n5.Delete Person\n6.Delete AddressBook\n7.sort Entries By Name");
			System.out.println("8.sort Entries By Zip\n9.Print Entries\n10.create New AddressBook\n11.open Existing Address Book\n12.search person in address book");
			System.out.print("Enter Ur Choice : ");
			int choice=scanner.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.print("Enter the Name of Address Book : ");
				bookName=scanner.next();
				service.createAddressBook(bookName);
				break;
				
			case 2:
				System.out.print("Enter the Name of Address Book : ");
				bookName=scanner.next();
				service.addPerson(bookName);
				break;
				
			case 3:
				System.out.print("Enter the Name of Address Book : ");
				bookName=scanner.next();
				service.displayPerson(bookName);

			case 4: 
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.editPerson(bookName);
				break;
				
			case 5:
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.deletePerson(bookName);
				break;
				
			case 6: 
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.deleteAddressBook(bookName);
				break;
				
			case 7:
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.sortEntriesByName(bookName);
				break;
				
			case 8:
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.sortEntriesByZip(bookName);
				break;
				
			case 9:
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.printEntries(bookName);
				break;
				
			case 10: 
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.createNewAddressBook(bookName);
			
			case 11:
				System.out.print("Enter the Address book name : ");
				bookName=scanner.next();
				service.openExistingAddBook(bookName);
				
			case 12: 
				System.out.println("Enter the person Name : ");
				String personName=scanner.next();
				service.searchPersonAddressBook(personName);

			default:
				System.out.println("Sorry u have entered Wrong Choice....");
				break;

			}
			System.out.println("do u want to Continue : ");
			decision=scanner.next().charAt(0);
		}while(decision=='y'||decision=='Y');
		
		scanner.close();
	}
}
