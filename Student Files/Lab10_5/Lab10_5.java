//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
import java.util.Arrays;

public class Lab10_5D
{
	private String[] prefix = new String[500];
	private String[] suffix = new String[500];
	private String[] words = new String[500];
	private int count = 0;
	
	public static void main (String[] args) 
	{
    	Lab10_5D lab = new Lab10_5D();
    	lab.input();
    	lab.process();
    	lab.output();
   }
   
   public void input()
   {
   		try
   		{
   			Scanner reader = new Scanner(new File("prefix.dat"));
   			while(reader.hasNext())
   				prefix[count++] = reader.next();
   		
   		}
   	
   		catch(IOException e)
   		{
   			System.out.print(e);
   			System.exit(0);
   		}
   		
   		try
   		{
   			Scanner reader = new Scanner(new File("suffix.dat"));
   			while(reader.hasNext())
   				suffix[count++] = reader.next();
   		
   		}
   	
   		catch(IOException e)
   		{
   			System.out.print(e);
   			System.exit(0);
   		}
   }
   
   public void process()
   {
   }
   
   public void output()
   {
   	System.out.println(count);
   }
}