import java.util.*;
import java.lang.*;
;
/*
 * Ex6b.java
 * 
 * Copyright 2016 bill kabb <billkabb@manjaro_pc>
 * 
 *                Exercise 6
 * Write a program that asks the user for 9 numbers: 
 * 1 with 1 digit, 1 with 2 digits, 1 with 3 digits, 
 * then again 1 with 1 digit, 1 with 2 digits, 1 with 3 digits, 
 * and then again 1 with 1 digit, 1 with 2 digits, 1 with 3 digits. 
 * Then the program will print them in columns, 
 * where each column will contain 1 single digit number, 
 * 1 double digit number, and 1 triple digit number. 
 * The columns will be 3 characters wide and will be separated from each other with the character +. 
 * The numbers inside the columns will be right justified. For example:
 * 			Enter numbers: 1 10 100 2 20 200 3 30 300
 *			  1|  2|  3
 *			 10| 20| 30
 *			100|200|300
 * 
 * 
 */


public class Ex6b {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int digit;
		int[] nums = new int[9];
		int count = 0;
		int count1 = 1; 
		//System.out.print("Please enter numbers: "); //***  comment out for version 2 ***
		for(int num : nums)
		{
			System.out.println("Please enter a number with "+count1+" digit(s)."); //*** uncomment for version 2 ***
			digit = in.nextInt();
			nums[count]= digit;
			count++;
			count1++;
			if(count1 == 4)
			{count1 = 1;}
			
			
		}
		String s;
		
		for(int i=0; i<nums.length/3; i+=1)
		{
			s=String.format("%1$3d" +"|"+"%2$3d"+"|"+"%3$3d", nums[0+i],nums[3+i],nums[6+i] );
			//System.out.print(nums[0+i]+"|"+nums[3+i]+"|"+nums[6+i]); // testing raw output
			System.out.println(s);
			
		}
		//System.out.println(Arrays.toString(nums)); // Print out array
	}
}

