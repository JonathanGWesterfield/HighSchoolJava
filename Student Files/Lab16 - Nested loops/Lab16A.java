//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab16A
{
	int width;
	int height;
	
	public static void main (String[] args) 
	{
    	Lab16A lab = new Lab16A();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the width and height of the rectangle: ");
    	width = reader.nextInt();
    	height = reader.nextInt();
    }
    
    public void output()
    {
    	for(int y = 1; y <=height; y++)
    	{
    		for(int x = 1; x<= width; x++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}