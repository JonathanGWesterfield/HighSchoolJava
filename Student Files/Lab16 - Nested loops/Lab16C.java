//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab16C
{
	int num;
	
	public static void main (String[] args) 
	{
    	Lab16C lab = new Lab16C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	num = reader.nextInt();
    }
    
    public void output()
    {
    	for(int y = num; y>=6; y--)
    	{
    		for(int x = y; x>=4; x--)
    		{
    			System.out.print(x + " ");
    		}
    		System.out.println();
    	}System.out.println();
    }
    
}
    	