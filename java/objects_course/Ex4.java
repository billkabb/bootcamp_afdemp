import java.util.*;
import java.lang.*;
/*
 * Ex4.java
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


public class Ex4 {
	
	public static void main (String[] args) {
		//Ex3 newArray = new Ex3();
		//System.out.println("array is: " + Arrays.toString(newArray.getArray()));
		//System.out.println(newArray.getClass());
		//System.out.println(Ex3.getArray());
		int[] myArInt = Ex3.getArray();
		System.out.println(Arrays.toString(myArInt));
		Double[] myArrDouble = new Double[10];
		
		for(int i=0; i<myArInt.length; i++) 
		{
			//Integer x = new Integer(myArInt[i]); // 1st method
			//myArrDouble[i] = x.doubleValue();    //********
			Double y = new Double(myArInt[i]);     // 2nd method
			myArrDouble[i] = y;
		}
		System.out.println(Arrays.toString(myArrDouble));
		
	}
}

