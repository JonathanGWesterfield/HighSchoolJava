//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab14A
{
	private String[] list = new String[100];
	private String city;
	private int count=0;
	
	public static void main (String[] args) 
	{
    	Lab14A lab = new Lab14A();
    	lab.fileinput();
    	lab.kybdinput();
    	lab.output();
    }
    
    public void fileinput()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab14a.dat"));
    		while(reader.hasNext())
    		{
    			list[count++] = reader.next();
    		}
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
    	System.out.print("Enter the name of a city: ");
    	city = kybd.next();
    }
    
    	 
    public void output()
    {
    	
    	for(int i =0; i<count; i++)
    	{
    	
    		if(city.equalsIgnoreCase(list[i]))
    			System.out.println(city + " is equal to " + list[i] + ".");
    		else
    			System.out.println(city + " is not equal to " + list[i] + ".");
    	}
    }
}
    
    