import java.util.*;
import java.lang.*;
import java.lang.Math.*;
/*
* Exercise 1
* 
* Create a static function, with the name "bootCamp", 
* that receives as an input two int arguments, i.e., number1 and number2, 
* and returns an int result in the end. If "number1" is smaller that "number2" 
* then returns the square root (use Math.sqrt method) of the absolute value 
* (use Math.abs) of the difference among "number1" and "number2". 
* Else return the sum of the two numbers. 
* Number1 = 25, Number2 = 91 
* Number1 = 91, Number2 = 25
 * 
 * 
 */


public class Ex1 {
	
	public static void main (String[] args) {
		System.out.println("First: "+bootcamp(25,91));
		System.out.println("Second: "+bootcamp(91,25));
		
    }
		
	public static int bootcamp(int num1 , int num2){
		
		if(num1<num2)
		{
			return (int)Math.sqrt(Math.abs(num2-num1));
		}
		
		return num1+num2;
	}
		
		
	
}

