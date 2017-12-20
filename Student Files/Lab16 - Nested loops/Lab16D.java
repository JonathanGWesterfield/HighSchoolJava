//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab16D
{
	int num;
	
	public static void main (String[] args) 
	{
    	Lab16D lab = new Lab16D();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the height of the triangle : ");
    	num = reader.nextInt();
    }
    
    public void output()
    {
    	for(int y = num; y>=0; y--)
    	{
    		for(int x = y; x>=0; x--)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	System.out.println();
    	
    }
}

    	    	