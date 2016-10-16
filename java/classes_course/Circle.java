import java.util.*;
import java.lang.*;
/*
 * Circle.java
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


public class Circle {
	
	private  int x;
	private  int y;
	private  int r;
	private static final double pi = 3.14;
	private static int number_of_circles=-1;
	
	Circle()		
	{
		this.x=0;
		this.y=0;
		this.r=1;
		number_of_circles++;
	}
	Circle(int x, int y)
	{
		this();
		this.x=x;
		this.y=y;
		number_of_circles++;
	}
	Circle(int x, int y, int r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
		number_of_circles++;
	}
	public Circle copy()
	{
		Circle new_circle = new Circle();
		new_circle.x=this.x;
		new_circle.y=this.y;
		new_circle.r=this.r;
		return new_circle;
	}
	
	//public static void main (String[] args) {
		
	//}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setR(int r)
	{
		this.r = r;
	}  
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getR()
	{
		return r;
	}
	public int getCirclesNumber()
	{
		return number_of_circles;
	}
	public void print()
	{
		System.out.println("I'm a circle at point ("+this.x+","+this.y+") with radius "+this.r);
	}
	public String calculateArea()
	{
		double val = pi*r*r;
		return String.format("%.2f",val);
	}
	public String calculatePerimeter()
	{
		double val = 2*pi*r;
		return String.format("%.2f",val);
	}
	public boolean cocentric(Circle c)
	{
		if((this.getY() == c.getY()) && (this.getX() == c.getX()) )
		{
			return true;
		}
		return false;
	}
}

