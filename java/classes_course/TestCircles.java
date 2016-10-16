import java.util.*;
import java.lang.*;
/*
 * TestCircle.java
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


public class TestCircles {
	
	
	public static void main (String[] args) {
		Circle c = new Circle();
		//c.setX(10);
		System.out.println("Default values of: "+"x = "+c.getX()+", y = "+c.getY()+", r = "+c.getR());
		System.out.println();
		c.setX(30);
		c.setY(30);
		c.setR(25);
		c.print();
		System.out.println();
		Circle c1 = new Circle(20,10);
		c1.print();
		System.out.println("Area: "+c1.calculateArea()+" ,Perimeter: "+c1.calculatePerimeter());
		System.out.println();
		Circle c2 = new Circle(10,10,5);
		c2.print();
		System.out.println("Area: "+c2.calculateArea()+" ,Perimeter: "+c2.calculatePerimeter());
		Circle c3 = c2.copy();
		c3.print();
		System.out.println("Area: "+c3.calculateArea()+" ,Perimeter: "+c3.calculatePerimeter());
		System.out.println("Test if cocentric: "+c2.cocentric(c1));
		Circle c4 = new Circle();
		System.out.println("Circles so far: "+c.getCirclesNumber());
										
												
		
	}
	//public void testC()
	//{
		
	//}
}

