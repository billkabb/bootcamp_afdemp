import java.util.Scanner;
/*
 * Ex2.java
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


public class Ex2 {
	
	public static void main (String[] args) {
		int count_temp = 0;
		int count = 0;
		int [] banknotes = {50,20,10,5,2,1};
		for(int x : banknotes)
		{
			System.out.print("enter num of "+x+" banknotes: ");
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			count_temp=x*i;
			count+=count_temp;
		}
		System.out.println("You have "+count+" euros.");
	}
}

