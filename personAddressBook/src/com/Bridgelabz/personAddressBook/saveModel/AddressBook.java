package com.Bridgelabz.personAddressBook.saveModel;

public interface AddressBook 
{
	void createAddressBook(String bookName);
	void addPerson(String bookName);
	void displayPerson(String bookName);
	void editPerson(String bookName);
	void deletePerson(String bookName);
	void deleteAddressBook(String bookName);
	void sortEntriesByName(String bookName);
	void sortEntriesByZip(String bookName);
	void printEntries(String bookName);
	void createNewAddressBook(String bookName);
	void openExistingAddBook(String BookName);
	void searchPersonAddressBook(String personName);
	void saveAddressBook();
	void saveAddressBookAs();
	void QuitProgram();
}
