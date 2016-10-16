import java.util.Scanner;

import java.io.*;
/*
 * Ex2b.java
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


public class Ex2b {
	
	public static void main (String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("please enter binary number: ");
		String num = in.next();
		String last = num.substring(7); // The last digit
		String first = num.substring(0,7); // the first 7 digits
		
		
		int count = 0;
		for(int i =0; i<first.length();i++)
		{
			count += Integer.valueOf(first.substring(i,i+1)); // 7 first digits convert
															  // to int and sum
		}
		
		if(count%2 == Integer.valueOf(last)) // check if both ints are odd or even 
		{									 // and print out check result
			System.out.println("Parity check OK.");
		}else{System.out.println("Parity check not OK.");}
		
	}
}

