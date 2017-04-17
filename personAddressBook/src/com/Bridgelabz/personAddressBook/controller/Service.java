package com.Bridgelabz.personAddressBook.controller;

import com.Bridgelabz.personAddressBook.saveModel.AddressBookImpl;

public class Service {
	AddressBookImpl addressBookIml = new AddressBookImpl();

	public void addPerson(String bookName) {
		addressBookIml.addPerson(bookName);
	}

	public void editPerson(String bookName) {
		addressBookIml.editPerson(bookName);
	}

	public void deletePerson(String bookName) {
		addressBookIml.deletePerson(bookName);
	}

	public void displayPerson(String bookName) {
		addressBookIml.displayPerson(bookName);
	}

	public void sortEntriesByName(String bookName) {
		addressBookIml.sortEntriesByName(bookName);
	}

	public void sortEntriesByZip(String bookName) {
		addressBookIml.sortEntriesByZip(bookName);
	}

	public void printEntries(String bookName) {
		addressBookIml.printEntries(bookName);	
	}

	public void deleteAddressBook(String bookName) {
		addressBookIml.deleteAddressBook(bookName);
	}

	public void createAddressBook(String bookName) {
		addressBookIml.createAddressBook(bookName);
	}

	public void createNewAddressBook(String bookName) {
		addressBookIml.createNewAddressBook(bookName);
	}
	
	public void openExistingAddBook(String bookName) {
		addressBookIml.openExistingAddBook(bookName);
	}
	
	public void searchPersonAddressBook(String personName) {
		addressBookIml.searchPersonAddressBook(personName);
	}
	
}
