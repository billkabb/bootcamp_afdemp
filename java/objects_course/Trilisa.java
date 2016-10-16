import java.util.*;
/*
 * trilisa.java
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


public class Trilisa {
	
	private static String[][] board ;//= new String[3][3];
	public static Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		board = new String[][] {{"X"," "," "},{" "," "," "},{" "," "," "}};
		//System.out.println(Arrays.toString(board));
		//System.out.println(board[0][0]);
		boolean finish = false;
		
		while(!finish)
		{
			
			System.out.print("please make your move : ");
			String move = in.next();
			if(move.equals("q"))
			{
				finish = true;
			}
			draw();
		}
		
		
	}
	
	public static void draw()
	{
		for(int i=0;i<3; i++)
		{
			System.out.print("| ");
			for(int j=0;j<3; j++)
			{
				
				System.out.print(board[i][j]+" | ");
				
			}
			System.out.println();
			
			
		}
	}
}

