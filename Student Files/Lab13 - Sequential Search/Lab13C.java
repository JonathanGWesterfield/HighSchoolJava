//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab13C
{
	private char[] list = new char[30];


	private char searchitem;
	private char replacevalue;
	
	public static void main (String[] args) 
	{
    	Lab13C lab = new Lab13C();
    	lab.fileinput();
    	lab.kybdinput();
    	lab.output();
    }
    
    public void fileinput()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab13c.dat"));
    		list = reader.nextLine().toCharArray();
    		
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
    	System.out.print("Enter a search value: ");
    	searchitem =  kybd.next().charAt(0);
    	System.out.print("Enter a replacement value: ");
    	replacevalue = kybd.next().charAt(0);
    	
    }
    
    public static int search(char list[],  char searchitem, char replacevalue)
    {
    	int count=0;
    	for(int  i = 0; i<list.length;i++)
    	{
    		if(list[i]==searchitem)
    		{
    			list[i] = replacevalue;
    			count++;
    			
    		}
    		
    	}
    	return count;
    }
    
    public void output()
    {
    	int times = 0;
    	System.out.print("Original Data: ");
    	for(int i = 0; i<list.length; i++)
    	{
    		System.out.print(list[i] + " ");
    	}
    	times = search(list, searchitem, replacevalue);
    	System.out.println("Search for: " + searchitem + ".");
    	System.out.println("Replace with: " + replacevalue + ".");
    
    	if(times==0)
    	{
    		System.out.println("The search item was not found.\nTry again.");
    	}
    	
    	else
    	{
    		System.out.println("Report: " + searchitem + " was replaced "+ times + " times with "+ replacevalue + ".");
    		System.out.print("Altered data: ");
    		for(int g = 0; g< list.length; g++)
    		{
    			System.out.print(list[g] + " ");
    		}
    	}
    	
    	
    	
    		
    	
    	
    	
    	
    }
}