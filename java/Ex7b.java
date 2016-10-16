import java.util.*;
import java.lang.*;
import java.math.*;

/*
 * Ex7b.java
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


public class Ex7b {
	
	private static Scanner in = new Scanner(System.in);
	private static String date1;
	private static String date2;
	
	
	public static void main (String[] args) {
		
		System.out.print("Please enter 1st date: ");
		
		date1=in.next();
		System.out.println();
		System.out.print("Please enter 2nd date: ");
		date2 = in.next();
		int d1;
		int d2;
		int m1;
		int m2;
		int y1;
		int y2;
		
		String delims = "[/]"; // 
		String[] date1StrAr = date1.split(delims);
		String[] date2StrAr = date2.split(delims);
		
		d1 = (Integer.valueOf(date1StrAr[0]));
		m1 = (Integer.valueOf(date1StrAr[1]));
		y1 = (Integer.valueOf(date1StrAr[2]));
		d2 = (Integer.valueOf(date2StrAr[0]));
		m2 = (Integer.valueOf(date2StrAr[1]));
		y2 = (Integer.valueOf(date2StrAr[2]));
		
		int firstD;// = new BigDecimal(d1) ;
		int firstM ;
		int firstY ;
		int secD ;
		int secM ;
		int secY ;
		
		if(y1>y2)
		{
			firstD = d1;
			firstM = m1;
			firstY = y1;
			secD = d2;
			secM = m2;
			secY = y2;
			
		}else{
			firstD = d2;
			firstM = m2;
			firstY = y2;
			secD = d1;
			secM = m1;
			secY = y1;
		}
		
		int diff = 0;
		//System.out.println(secY);
		//if(secY<1)
		//{
			//diff = Math.abs(secY)+1;
			//secY = 1;
			//System.out.println(secY);
			//firstY+=diff;
			//System.out.println(firstY);
		//}
		int c1;
		int c2;
		
		c1 = (365*firstY)+(firstY/4)-(firstY/100)+(firstY/400)+(((306*firstM)+5)/10)+(firstD-1);
		c2 = (365*secY)+(secY/4)-(secY/100)+(secY/400)+(((306*secM)+5)/10)+(secD-1);
		//c1 = (365*firstY)+Math.floor((firstY/4))-Math.floor((firstY/100))+Math.floor((firstY/400))+(Math.floor(((306*firstM)+5)/10))+(firstD-1);
		//c2 = (365*secY)+Math.floor((secY/4))-Math.floor((secY/100))+Math.floor((secY/400))+(Math.floor(((306*secM)+5)/10))+(secD-1);
		System.out.println((c1-c2)+" Days.");
		//System.out.println(d1+" "+m1+" "+y1);
		//System.out.println(d2+" "+m2+" "+y2);
		
	}
}

