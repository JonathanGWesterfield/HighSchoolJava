//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab13B
{
	private int[] list = new int[14];
	private int count =0;
	private int searchitem;
	private int replacevalue;
	
	public static void main (String[] args) 
	{
    	Lab13B lab = new Lab13B();
    	lab.fileinput();
    	lab.kybdinput();
    	lab.output();
    }
    
    public void fileinput()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab13b.dat"));
    		while(reader.hasNextInt())
    			list[count++] = reader.nextInt();
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    }
    
    public void kybdinput()
    {
    	Scanner kybd = new Scanner(System.in);
    	System.out.print("Enter a number to replace: ");
    	searchitem = kybd.nextInt();
    	System.out.print("Enter a replacement value: ");
    	replacevalue = kybd.nextInt();
    		
    }
    
    public static int findindex(int list[], int count, int searchitem,int replacevalue)
    {
    	for(int i=0; i<count; i++)
    	{	
    		if(list[i]==searchitem)
    		{
    			list[i] = replacevalue;
    			return i;
    		}
    		
    	}
    	return -1;
    }
    
    
    public void output()
    {
    	
    	System.out.print("Original data: ");
    	for(int i = 0; i<count; i++)
    		System.out.print(list[i] +" ");
    		System.out.println();
    	
    	int index = findindex(list,count, searchitem,replacevalue);
    	if(index==-1)
    	{
    		System.out.println(searchitem + " was not found in the list.");
    	}
    	
    	else
    	{
    		System.out.println("The " + searchitem + " found at position " + index + " was replaced with "+ replacevalue);
    		System.out.print("The modified list: "  );
    		for(int l = 0; l< list.length; l++)
    		{
    			System.out.print(list[l]+ " ");
    		}
    	}
    }   
}