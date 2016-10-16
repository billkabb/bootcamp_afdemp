/*
 * Librarian.java
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


public class Librarian {
	
	//public static void main (String[] args) {
		
	//}
	private Library library;
	Librarian(Library library)
	{
		this.library=library;
	}
	//Librarian(Library library, Book[] books)
	//{
		
		//this.library = new Library(books);
		////this.library=library;
	//}
	public void findMeBooksFromAuthor(String author) //(Receives an author name and delegates the request to the library's printBookFromAuthor method)
	{
		this.library.printBookFromAuthor(author);
	}
	public void findMeAvailableBooks() //(Delegates the request to the library's printAvailableBooks method)
	{
		this.library.printAvailableBooks();
	} 
	public void findMeBook(String title) //(Receives a book's title and delegates the request to the library's printBookDetails method)
	{
		this.library.printBookDetails(title);
	}
}

