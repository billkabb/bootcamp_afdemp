/*
 * inherit.java
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


public class Employee {
	private String name ;
	private String surName ;
	private int birthDate ;
	
	
	Employee()
	{
		this.birthDate = 99;
	}
	
	
	
	Employee(String name, String surName)
	{
		this();
		this.name = name;
		this.surName = surName;
		
		//this.birthDate = birthDate;
		
	}
	public static void main (String[] args) {
		
	}
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	public void setSurname(String surName)
	{
		this.surName = surName;
	}
	public void setName(int birthDate)
	{
		this.birthDate = birthDate;
	}
	public String getName()
	{
		return this.name;
	}
	public String getSurname()
	{
		return this.surName;
	}
	public int getBirthDate()
	{
		return birthDate;
	}
	public String toString()
	{
		
		return this.name;
	}
}

