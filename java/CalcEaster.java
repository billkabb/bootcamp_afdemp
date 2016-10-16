import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * CalcEaster.java
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


public class CalcEaster {
	private static int a;
	private static int b;
	private static int c;
	private static int d;
	private static int e;
	private static int year = 0;
	private static int month;
	private static int day;
	private static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		//String next = in.next();
		System.out.println("##############################");
		System.out.println("# Orthodox Easter Calculator #");
		System.out.println("##############################");
		
		System.out.print("Please enter the year: ");
		//year = in.nextInt();
		do{
			
			//System.out.print("Please enter the year: ");
			
			try{
				year = in.nextInt();
				
			} catch (InputMismatchException e) {
				//System.out.println(e.getMessage());
				System.out.print("This is not a number please try again: ");
				// Flush the buffer
				in.nextLine();
				year = in.nextInt();
			}
			a = year % 4;
			b = year % 7;
			c = year % 19;
			d = ((19*c)+15)%30;
			e = ((2*a)+(4*b)-d+34)%7;
			month = (d + e + 114)/31;
			day = ((d + e + 114)%31)+1;
			day = day + 13;
			//System.out.println(day);
			if(day > 30)
			{
				if(month == 3 && day >31)
				{
					day = day - 31;
					month++;
				}
				else if(month == 4)
				{
					day = day - 30;
					month++;
				}
			}
			
			System.out.println("Day: "+ day +" "+"Month: "+month+"\n");
			System.out.print("Please enter a year or press \"q\" to quit: ");
			
			
			
		}
		while
		(in.hasNextInt() || !in.next().equals("q"));
		
	}
}

