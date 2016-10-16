/*
 * Book.java
 * 
 * Copyright 2016 bill kabb <billkabb@manjaro_pc>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * Class Book
	Fields: title (String), author (custom type Author), isbn (String), physical_copies (int), available_copies (int) and times_rented (int)
		isbn should not be changed after the initialization
	Methods:
		toString (returns the details of the book in printable way. the book author's details should be acquired with the toString method from the Book class)
		rentPhysicalCopy (checks if there is an available copy for renting. If yes, then it prints a message of success. What fields should be modified upon success??)
 * 
 */


public class Book {
	
	private String title;
	private Author author;
	private final String isbn;
	private int physical_copies;
	private int available_copies;
	private int times_rented;
	
	//public static void main (String[] args) {
		
	//}
	Book(String title, Author author, String isbn, int physical_copies, int available_copies, int times_rented)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.physical_copies = physical_copies;
		this.available_copies = available_copies;
		this.times_rented = times_rented;
		
		
	}
	public String toString()
	{
		//String aboutBook = ("Book name: "+title+" \nAuthor name: "+author.toString()+" \nAvailable copies: "+available_copies);
		return this.title;//aboutBook;
	}
	public String bookDetails()
	{
		String aboutBook = ("Book name: "+this.title+" \nAuthor name: "+this.author.toString()+"\nISBN: "+this.isbn+"\nTimes rented: "+this.times_rented+" \nAvailable copies: "+available_copies);
		return aboutBook;
	}
	public String rentPhysicalCopy()
	{
		if(this.isAvailable())
		{
			this.available_copies-=1;
			return "Congrats you have rent: "+this.title;
		}
		return "Great choice but we are sorry.. For now this book is not available.";
	}
	public boolean isAvailable()
	{
		if(available_copies>0)
		{
			return true;
		}// check if physical copy available
		return false;
	}
	public boolean hasAuthor(String author)
	{
		if(this.author.toString().equalsIgnoreCase(author))
		{
			return true;
		}
		return false;
	}
}

