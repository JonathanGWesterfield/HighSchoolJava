//Jonathan Westerfield

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Lab10B
{
	private int[] list = new int [8];
	private int count;
	private int sum;
	private double average;
		
	public static void main (String[] args) 
	{
    	Lab10B lab = new Lab10B();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab10b.dat"));
    		while(reader.hasNextInt())
    			list[count++] = reader.nextInt();
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    	
    }
    
    public void process()
    {
    	for(int i = 0; i < count; i++)
    	{
    		sum = sum+list[i];
    	}
    		average = (double)sum / (double)count;
    		
    }
    
    
    public void output()
    {
    	
    	DecimalFormat df = new DecimalFormat(".#");
    	for(int z = 0; z < list.length; z++)
    	{
    		System.out.print(list[z] + " ");
    	}
    	System.out.println("\nThe sum of the numbers is " + sum);
    	System.out.println("The average of the numbers is " + df.format(average));
    	
    }
}