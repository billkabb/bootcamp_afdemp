import java.util.*;
import java.lang.*;
import java.lang.Math.*;
/*
*Exercise 2
* 
*Create a program that simulates the roll of two dices. 
* The program must execute till both dices return 1 as a result (use Math.random). 
* You can create a class name Dice which has a void roll method. 
* Roll method is rolling the dices till the needed results is aquired and 
* prints the number of rolls needed in order to have two 1s.
 * 
 */


public class Dice {
	
	private final  int first = 1;
	private final  int last = 6;
	
	//public static void main (String[] args) {
		
		//roll();
		
		
    //}
		
	private void roll(){
		int randomNum1 =0;
		int randomNum2 =0;
		int count = 0;
		
		while(! (randomNum1 == 1 && randomNum1==randomNum2))
		{
			randomNum1 = first + (int)(Math.random() * last);
			randomNum2 = first + (int)(Math.random() * last);
			count++;
		}
		System.out.println("Snake eyes after "+count+" rolls. Keep rolling !!!");
	}
	public void getRoll()
	{
		roll();
	}
		
		
	
}

