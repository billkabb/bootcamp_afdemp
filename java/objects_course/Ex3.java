import java.util.*;
/*
 * Ex3.java
 * 
 * Exercise 3
 *Create an array that can receive 10 elements, as a size, 
 * and add in each position an element starting from 1 to 10 statically 
 * and print the array. Afterwards, create a method (function) 
 * that can shift the array elements right by 10 times. 
 * The 10 is given by the user as an input. 
 * At the end print the shifted array. 
 */


public class Ex3 {
	
	private static int[] myArray = new int[10];
	
	
	Ex3()
	{
		for(int i=0; i<10; i++)
		{
			myArray[i] = i+1;
		}
	}
	public static void main (String[] args) {
		//int[] myArray = new int[10];
		for(int i=0; i<10; i++)
		{
			myArray[i] = i+1;
		}
		System.out.println("My initial array is: "+Arrays.toString(myArray));
		//System.out.println(myArray[0]);
		System.out.println();
		swiftArray(10);
	}
	public static int[] getArray()
	{
		int[] myArray1 = new int[]{1,2,3,4,5,6,7,8,9,10};
		return myArray1;
	}
	
	public static void swiftArray(int times)
	{
		int count = 1;
		while(!(count==times+1))
		{
			System.out.print("[");
			for(int i=0; i<times; i++)
			{
				int range = i+count-1;
				if(range>=10)
				{ 
					range = range-10;
				}
				if(!(i==times-1))
				{
					System.out.print(myArray[range]+",");
				}else{System.out.print(myArray[range]);}
				
				
			}
			System.out.print("]");
			System.out.println();
			count++;
		}
	}
}

