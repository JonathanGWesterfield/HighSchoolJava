//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
import java.util.Arrays;

public class Lab10C
{
	private double[] list = new double[50];
	private int count;
	
	public static void main (String[] args) 
	{
    	Lab10C lab = new Lab10C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab10c.dat"));
    		while(reader.hasNextInt())
    		{
    			list[count++] = reader.nextInt();
    		}
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    	
    }
    
    public void output()
    {
    }
}
