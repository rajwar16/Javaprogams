package com.Bridgelabz.personAddressBook.model;

import java.util.Comparator;

public class Person 
{
	private String firstName,lastName,Address,city,state;
	private int zip,phone;

	/*Person(String firstName, String lastName, String address, String city, String state, int zip, int phone) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.Address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}
	 */
	
	public String toString() 
	{
		return firstName+" "+lastName+" "+Address+" "+city+" "+state+" "+zip+" "+phone;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public static Comparator<Person> sortEntriesName = new Comparator<Person>() {

		public int compare(Person s1, Person s2) {
			String FirstName1 = s1.getFirstName().toUpperCase();
			String FirstName2 = s2.getFirstName().toUpperCase();

			//ascending order
			return FirstName1.compareTo(FirstName2);

			//descending order
			//return StudentName2.compareTo(StudentName1);
		}
	};
	
	public static Comparator<Person> sortEntriesZip=new Comparator<Person>(){
		public int compare(Person s1, Person s2) {
			int Zip1 = s1.getZip();
			int Zip2 = s2.getZip();

			//ascending order
			return Zip1-Zip2;

			//descending order
			//return StudentName2.compareTo(StudentName1);
		}
	};

}
