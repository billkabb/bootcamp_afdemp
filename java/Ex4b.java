import java.util.Scanner;
/*
 * Ex3b.java
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


public class Ex4b {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("please enter 9 digit number: ");
		String num = in.next();
		for(int i =0; i<num.length()-6;i+=1)
		{
			if(i==1 || i==2)
			{
				System.out.println();
				System.out.print(" ");
				if(i==2)System.out.print(" ");
			}
			System.out.print(num.substring(i,i+1)+" ");
			System.out.print(num.substring(i+3,i+4)+" ");
			System.out.print(num.substring(i+6,i+7)+" ");
			
		}
		
	}
}

