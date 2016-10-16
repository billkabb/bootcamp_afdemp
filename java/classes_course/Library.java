import java.lang.System.*;
/*
 * Library.java
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
 * 
 */


public class Library {
	
	private Book[] books ;
	
	//public static void main (String[] args) {
		
	//}
	Library()
	{
		this.books = new Book[20];
	}
	Library(Book[] books)
	{
		this.books=books;
	}
	//methods
	
	public void printAvailableBooks()     //printAvailableBooks (Checks the book collection and prints those that are available. Hint: Use the isAvailable and the toString methods from the Book class
	{
		String available = "";//"Books currently available are: ";
		for(Book i : books)
		{
			if(i.isAvailable())
			{
				available += i.toString()+", "; 
			}
		}
		String available_formated = available.substring(0, available.length() - 2);
		System.out.println("Books currently available are: "+available_formated+" .");
	}
	//printBookDetails (Searches for a book based on a given title. If the book exists then its details should be printed, otherwise an error message should be displayed)
	public void printBookDetails(String title)
	{
		for(Book i : books)
		{
			if(i.toString().equalsIgnoreCase(title))
			{
				System.out.println(i.bookDetails());
				return;
			}
		}
		System.out.println("Sorry. This book is not in our list.");
	}
	//printBookFromAuthor (prints only the books that have an author that matches a given name)
	public void printBookFromAuthor(String author)
	{
		String authorBooks = "";
		for(Book i : books)
		{
			if(i.hasAuthor(author))
			{
				authorBooks += i.toString()+", ";
				//System.out.print(i.toString());
				//return;
			}
		}
		if(!authorBooks.equals(""))
		{
			System.out.println("Your have search for books from author: "+author+" \nAuthor`s books are: "+authorBooks.substring(0, authorBooks.length() - 2)+" .");
		}else{System.out.println("Sorry. This author has no books in our list.");}
		//System.out.println("Sorry. This book is not in our list.");
	}
	public void addBook(Book title)
	{
		//this.libraryMaintenance();
		int count=0;
		for(Book i : books)
		{
			count++;
		}
		if(count<books.length)
		{
			books[count-1]=title;
		}
		else
		{
			this.libraryMaintenance();
			count=0;
			for(Book i : books)
			{
				count++;
			}
			books[count-1]=title;
		}
		
	}
	
	public void libraryMaintenance()
	{
		int count=0;
		for(Book i : books)
		{
			count++;
		}
		if(count>=books.length-1)
		{
			Book[] booksNew = new Book[books.length*2];
			System.arraycopy(books, 0, booksNew, 0, books.length);
			books = booksNew;
		}
	}
	

}

