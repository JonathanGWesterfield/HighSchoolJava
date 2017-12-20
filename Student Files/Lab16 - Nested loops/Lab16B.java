//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab16B
{
	int height;
	
	public static void main (String[] args) 
	{
    	Lab16B lab = new Lab16B();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the height of the triangle: ");
    	height = reader.nextInt();
    }
    
    public void output()
    {
    	for(int y = 1; y <= height; y++)
    	{
    		for(int x = 1; x <=y; x++)
    		{
    			System.out.print(x);
    		}
    		System.out.println();
    	}
    }
}