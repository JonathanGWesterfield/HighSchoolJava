//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab13A
{
	private int[] list = new int[20];
	private int count = 0;
	private int searchitem;
	int countp = 0;
	
	public static void main (String[] args) 
	{
    	Lab13A lab = new Lab13A();
    	lab.kybdinput();
    	lab.fileinput();
    	lab.output();
    }
    
    public void fileinput()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab13a.dat"));
    		while(reader.hasNextInt())
    			list[count++] =  reader.nextInt();
    	}
    	
    	catch(IOException e)
    	{
    		System.out.print(e);
    		System.exit(0);
    	}
    }
    
    public void kybdinput()
    {
    	Scanner kybd = new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	searchitem  = kybd.nextInt();
    }
    public static int find(int list[], int searchitem)
    {
    	int times = 0;
    	for(int i = 0; i<list.length ; i++)
    	{
    		if(searchitem==list[i])
    			times++;
    			
    	}
    	return times;
    }
    
    
    public void output()
    {
    	System.out.print("Original Data ");	
    		for(int i=0; i<count;i++)
    			System.out.print(list[i]+ " ");
    			System.out.println();
    	System.out.println("Search Item: " + searchitem);
    	System.out.println("Number of occurrences: " + find(list,searchitem));
    }
}