//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab10A
{
	private int[] list = new int[400];
	private int count = 0;
	public static void main(String[] args) 
	{
    	Lab10A lab = new Lab10A();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab10a.dat"));
    		while(reader.hasNextInt())
    			list[count++] = reader.nextInt();
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    	
    	
    }
    
    
    public void output()
    {
    	Arrays.sort(list,0 ,count);
    	int ncount = 0;
    	for(int i = 0 ; i <= count ; i++)
    		{	
    			if(list[i] > 0)
    			{
    				System.out.print(i + " ");
    				ncount++;
    			}
    		}
    
		System.out.println("This array contains " + ncount + " numbers.");
		System.out.println("There are " + (400-ncount) + " unused elements.");
    }
}