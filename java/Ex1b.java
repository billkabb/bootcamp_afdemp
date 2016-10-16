import java.util.Scanner;
import java.lang.*;

/*
 * Ex1b.java
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


public class Ex1b {
	
	public static void main (String[] args) {
		int[] tin = new int[9];
		Scanner in = new Scanner(System.in);
		System.out.print("please enter your tin number: ");
		String num = in.next();
		//int count = 0;
		//String strNum = ""+num;
		//System.out.println(num);
		String strNum = num;
		//System.out.println(strNum);
		for (int i=0; i<strNum.length(); i++) //System.out.print(1);
		{
			
			char c = strNum.charAt(i);
			//System.out.println(c);
			
			tin[i] = Character.getNumericValue(c);
			
		}
		//System.out.print(Integer.toString(num));
		//System.out.print(tin[1]);
		int[] tinSmall = new int[8];
		for(int i=0; i<tinSmall.length; i++) 
		{
			tinSmall[i]=tin[i];
		}
		// 
		//System.out.println(tinSmall[tinSmall.length-2]);
		int count = 1;
		int sum = 0;
		int sum_total = 0;
		for(int i=(tinSmall.length-1); i>0; i--)
		{
			sum =0;
			sum = tinSmall[i] * (int)Math.pow(2 , count);
			sum_total = sum+sum_total;
			
			//System.out.println(tinSmall[i]+""+(int)Math.pow(2 , count));
			count++;
		}
		//System.out.print(sum_total +" "+sum_total%11 +" "+ tin[tin.length-1]%10);
		//System.out.println(tinSmall[1]);
		if(sum_total%11 == tin[tin.length-1]%10)
		{
			System.out.println("OK . you enter a valid TIN.");
		}
		else
		{
			System.out.println("Your TIN number is wrong.");
		}
	}
}

