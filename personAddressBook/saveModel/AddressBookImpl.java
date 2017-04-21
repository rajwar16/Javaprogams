package com.Bridgelabz.personAddressBook.saveModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.Bridgelabz.personAddressBook.model.Person;

/**
 * @author bridgeit
 */

public class AddressBookImpl implements AddressBook
{
	/*LinkedList<Person> linkedList=null;
	FileOutputStream fileOutputStream=null;
	FileInputStream fileInputStream=null;
	ObjectOutputStream objectOutputStream=null;
	ObjectInputStream objectInputStream=null;
	 */
	HashMap<String,LinkedList<Person>> hashMap=new HashMap<String,LinkedList<Person>>();

	Scanner scanner=new Scanner(System.in);

	/* (non-Javadoc)
	 * @see com.Bridgelabz.personAddressBook.saveModel.AddressBook#createAddressBook(java.lang.String)
	 * create the Address Book
	 */

	public void writeObjectIntoFile(HashMap<String, LinkedList<Person>> hashMap2)
	{

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			File file=new File("person2.ser");
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(hashMap2);
			objectOutputStream.flush();
			objectOutputStream.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}


	public HashMap<String, LinkedList<Person>> readObjectIntoFile()
	{

		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		HashMap<String, LinkedList<Person>>	hashmap1 = null;

		try{
			File file=new File("person2.ser");
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			hashmap1=(HashMap<String, LinkedList<Person>>) objectInputStream.readObject();
			objectInputStream.close();
		} 
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return hashmap1;
	}

	public void createAddressBook(String bookName)
	{
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			System.out.println("This Address Book already present inside record....");
			System.out.println("Enter Different Address book name...");
			String AddBookName=scanner.next();
			createAddressBook(AddBookName);
		}

		if(hashmap1.get(bookName)==null)
		{
			hashmap1.put(bookName, new LinkedList<Person>());
			System.out.println(bookName+" AddressBook Created SuccessFully....");
			writeObjectIntoFile(hashmap1);
			System.out.println("Do u want to add Person information press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				addPerson(bookName);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.Bridgelabz.personAddressBook.saveModel.AddressBook#addPerson(java.lang.String)
	 * it Add Person inside the address Book
	 */
	public void addPerson(String bookName)
	{
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();

		System.out.println("write object successfully...");
		if(hashmap1.containsKey(bookName))
		{

			System.out.println("---New Person---");
			System.out.println();
			Person person=new Person();

			System.out.print("Enter First Name : ");
			String firstName=scanner.next();
			person.setFirstName(firstName);

			System.out.print("Enter Last Name : ");
			String lastName=scanner.next();
			person.setLastName(lastName);

			System.out.print("Enter Address : ");
			String address=scanner.next();
			person.setAddress(address);

			System.out.print("Enter City : ");
			String city=scanner.next();
			person.setCity(city);

			System.out.print("Enter State : ");
			String state=scanner.next();
			person.setState(state);

			System.out.print("Enter Zip : ");
			int zip=scanner.nextInt();
			person.setZip(zip);

			System.out.print("Enter Phone No. : ");
			int phone=scanner.nextInt();
			person.setPhone(phone);

			System.out.print("Do u want to create then press yes: ");
			String choice=scanner.next(); 
			if(choice.equalsIgnoreCase("yes"))
			{
				if(hashmap1.get(bookName)==null)
					hashmap1.put(bookName, new LinkedList<Person>());
				hashmap1.get(bookName).add(person);

				writeObjectIntoFile(hashmap1);

				HashMap<String, LinkedList<Person>>	hashmap2=readObjectIntoFile();;
				System.out.println(hashmap2);
				hashMap=hashmap2;

				//System.out.println(arraylist);
				//System.out.println(hashMap);
				System.out.println("person data Added successfully....");
				System.out.println("|---------------------------------------|");
				System.out.println("|data is as follow : ");
				displayInfo(person);
			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}

		}

	}


	/* (non-Javadoc)
	 * @see com.Bridgelabz.personAddressBook.saveModel.AddressBook#displayPerson(java.lang.String)
	 * It Display person Information
	 * param String type BookName
	 * 
	 */
	public void displayPerson(String bookName) {
		boolean flag=false;
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		System.out.println(hashmap1.keySet());
		if(hashmap1.containsKey(bookName))
		{
			printEntries(bookName);
			LinkedList<Person> linkedlist=hashmap1.get(bookName);
			//System.out.println(arraylist);

			printEntries(bookName);
			System.out.println("which person's data u want to Display : ");

			System.out.print("Enter the First name: ");
			String firstName1=scanner.next();
			System.out.print("Enter the last name : ");
			String lastName1=scanner.next();
			Person personInfo=null;

			for (int i = 0; i < linkedlist.size(); i++) 
			{
				personInfo=linkedlist.get(i);

				if(firstName1.equals(personInfo.getFirstName()) && lastName1.equals(personInfo.getLastName()))
				{
					System.out.println("|-------------|-------------------------|");
					System.out.println("|first Name   |  "+personInfo.getFirstName());
					System.out.println("|-------------|-------------------------|");
					System.out.println("|Last Name    |  "+personInfo.getLastName());
					System.out.println("|-------------|-------------------------|");
					System.out.println("|Address      |  "+personInfo.getAddress());
					System.out.println("|-------------|-------------------------|");
					System.out.println("|City         |  "+personInfo.getCity());
					System.out.println("|-------------|-------------------------|");
					System.out.println("|State        |  "+personInfo.getState());
					System.out.println("|-------------|-------------------------|");
					System.out.println("|Zip          |  "+personInfo.getZip());
					System.out.println("|-------------|-------------------------|");
					System.out.println("|phone No     |  "+personInfo.getPhone());
					System.out.println("|-------------|-------------------------|");
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}
	}


	/* (non-Javadoc)
	 * @see com.Bridgelabz.personAddressBook.saveModel.AddressBook#displayPerson(java.lang.String)
	 * It Display person Information
	 * param String type BookName
	 * 
	 */
	public void displayInfo(Person personInfo)
	{
		/*
		ArrayList<Person> arraylist=hashMap.get(bookName);
		System.out.println(arraylist);

		for (int i = 0; i < arraylist.size(); i++) 
		{
			Person personInfo=arraylist.get(i);
		 */

		System.out.println("|-------------|-------------------------|");
		System.out.println("|first Name   |  "+personInfo.getFirstName());
		System.out.println("|-------------|-------------------------|");
		System.out.println("|Last Name    |  "+personInfo.getLastName());
		System.out.println("|-------------|-------------------------|");
		System.out.println("|Address      |  "+personInfo.getAddress());
		System.out.println("|-------------|-------------------------|");
		System.out.println("|City         |  "+personInfo.getCity());
		System.out.println("|-------------|-------------------------|");
		System.out.println("|State        |  "+personInfo.getState());
		System.out.println("|-------------|-------------------------|");
		System.out.println("|Zip          |  "+personInfo.getZip());
		System.out.println("|-------------|-------------------------|");
		System.out.println("|phone No     |  "+personInfo.getPhone());
		System.out.println("|-------------|-------------------------|");

	}


	/* (non-Javadoc)
	 * @see com.Bridgelabz.personAddressBook.saveModel.AddressBook#editPerson(java.lang.String)
	 * update the person Information
	 */

	public void editPerson(String bookName) 
	{
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			boolean flag=false;
			LinkedList<Person> linkedlist=hashMap.get(bookName);
			//System.out.println(arraylist);

			printEntries(bookName);
			System.out.println("which data u want to update : ");

			System.out.print("Enter the First name: ");
			String firstName1=scanner.next();
			System.out.print("Enter the last name : ");
			String lastName1=scanner.next();
			Person person=null;

			for (int i = 0; i < linkedlist.size(); i++) 
			{
				person=linkedlist.get(i);

				if(firstName1.equals(person.getFirstName()) && lastName1.equals(person.getLastName()))
				{
					System.out.println("Current Details are : ");
					displayInfo(person);

					System.out.print("Enter First Name : ");
					String firstName=scanner.next();
					person.setFirstName(firstName);

					System.out.print("Enter Last Name : ");
					String lastName=scanner.next();
					person.setLastName(lastName);

					System.out.print("Enter Address : ");
					String address=scanner.next();
					person.setAddress(address);

					System.out.print("Enter City : ");
					String city=scanner.next();
					person.setCity(city);

					System.out.print("Enter State : ");
					String state=scanner.next();
					person.setState(state);

					System.out.print("Enter Zip : ");
					int zip=scanner.nextInt();
					person.setZip(zip);

					System.out.print("Enter Phone No. : ");
					int phone=scanner.nextInt();
					person.setPhone(phone);
					flag=true;
				}
			}

			if(flag)
			{
				System.out.println("Data updated Successfully....");
				writeObjectIntoFile(hashmap1);
				hashMap=hashmap1;
				System.out.println("Updated Data are : ");
				displayInfo(person);
			}

			else
			{
				System.out.println("sorry that data is not present inside record....."); 

			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.Bridgelabz.personAddressBook.saveModel.AddressBook#deletePerson(java.lang.String)
	 * it delete purticular person data
	 */

	public void deletePerson(String bookName) 
	{
		boolean flag=false;
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			LinkedList<Person> linkedlist=hashmap1.get(bookName);
			System.out.println("which data u want to delete : ");

			System.out.print("Enter the First name: ");
			String firstName1=scanner.next();
			System.out.print("Enter the last name : ");
			String lastName1=scanner.next();

			for (int i = 0; i < linkedlist.size(); i++) 
			{
				Person person=linkedlist.get(i);

				if(firstName1.equals(person.getFirstName()) && lastName1.equals(person.getLastName()))
				{
					linkedlist.remove(i);
					flag=true;
					break;
				}
			}
			if(flag)
			{
				writeObjectIntoFile(hashmap1);
				hashMap=hashmap1;
				System.out.println("the person record remove successfully.....");
			}
			else{
				System.out.println("sorry the person's record not present inside address book...");
			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}
	}


	public void deleteAddressBook(String bookName) 
	{
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			hashmap1.remove(bookName);
			writeObjectIntoFile(hashmap1);
			hashMap=hashmap1;
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}
	}

	public void sortEntriesByName(String bookName) 
	{
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			LinkedList<Person> linkedlist=hashmap1.get(bookName);
			Collections.sort(linkedlist, Person.sortEntriesName);

			for(Person str: linkedlist){
				System.out.println(str);
			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}

	}

	public void sortEntriesByZip(String bookName) {

		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			LinkedList<Person> linkedlist=hashmap1.get(bookName);
			Collections.sort(linkedlist, Person.sortEntriesZip);

			for(Person str: linkedlist)
			{
				System.out.println(str);
			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}
	}

	public void printEntries(String bookName) {

		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			LinkedList<Person> linkedlist=hashMap.get(bookName);
			//System.out.println(arraylist);

			Person personInfo=null;

			for (int i = 0; i < linkedlist.size(); i++) 
			{
				personInfo=linkedlist.get(i);
				System.out.println("|-------------|-------------------------|");
				System.out.println(personInfo.getFirstName()+" "+personInfo.getLastName()+" other Information : ");

				System.out.println("|-------------|-------------------------|");
				System.out.println("|first Name   |  "+personInfo.getFirstName());
				System.out.println("|-------------|-------------------------|");
				System.out.println("|Last Name    |  "+personInfo.getLastName());
				System.out.println("|-------------|-------------------------|");
				System.out.println("|Address      |  "+personInfo.getAddress());
				System.out.println("|-------------|-------------------------|");
				System.out.println("|City         |  "+personInfo.getCity());
				System.out.println("|-------------|-------------------------|");
				System.out.println("|State        |  "+personInfo.getState());
				System.out.println("|-------------|-------------------------|");
				System.out.println("|Zip          |  "+personInfo.getZip());
				System.out.println("|-------------|-------------------------|");
				System.out.println("|phone No     |  "+personInfo.getPhone());
				System.out.println("|-------------|-------------------------|");
			}
		}
		else
		{
			System.out.println("Sorry this Address book is Not in record.....");
			System.out.println("Do u want to Create Address book press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				createAddressBook(bookName);
			}
		}
	}

	public void createNewAddressBook(String bookName) 
	{
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			System.out.println("This Address Book already present inside record....");
			System.out.println("Enter Different Address book name...");
			String AddBookName=scanner.next();
			createAddressBook(AddBookName);
		}

		if(hashMap.get(bookName)==null)
		{
			hashMap.put(bookName, new LinkedList<Person>());
			System.out.println(bookName+" New AddressBook Created SuccessFully....");
			System.out.println("Do u want to add Person information press yes..");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				addPerson(bookName);
			}
		}
	}

	public void openExistingAddBook(String bookName) {
		HashMap<String, LinkedList<Person>> hashmap1=readObjectIntoFile();
		if(hashmap1.containsKey(bookName))
		{
			printEntries(bookName);
			System.out.println("Do u want to update press yes: ");
			String choice=scanner.next();
			if(choice.equals("yes"))
			{
				editPerson(bookName);
			}
		}
	}


	public void searchPersonAddressBook(String personName) 
	{
		Iterator iterator=hashMap.entrySet().iterator();

		for (String key : hashMap.keySet()) 
		{
			LinkedList<Person> linkedlist= hashMap.get(key);
			for (int i = 0; i < linkedlist.size(); i++) 
			{
				Person person = linkedlist.get(i);
				if(personName.equals(person.getFirstName()))
				{
					System.out.println(personName+" present inside "+key+" AddressBook");
					displayInfo(person);
				}

			}
		}
	}


	public void saveAddressBook() {

	}

	public void saveAddressBookAs() {

	}

	public void QuitProgram() {

	}


}
