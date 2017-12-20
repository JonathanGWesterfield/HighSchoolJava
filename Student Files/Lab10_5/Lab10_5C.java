//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
import java.util.Arrays;

public class Lab10_5C
{
	private String[] list = new String[500];
	private int count = 0;
	private String letter;
		
	public static void main (String[] args) 
	{
    	Lab10_5C lab = new Lab10_5C();
    	lab.fileinput();
    	lab.kybdinput();
    	lab.output();
   }
   
   public void fileinput()
   {
   		try
   		{
   			Scanner reader = new Scanner(new File("animals.dat"));
   			while(reader.hasNext())
   				list[count++] = reader.next();
   		}
   	
   		catch(IOException e)
   		{
   			System.out.print(e);
   			System.exit(0);
   		}
   }
   
   public void kybdinput()
   {
   		Scanner reader = new Scanner(System.in);
   		System.out.print("Enter a letter (A-Z): ");
   		letter = reader.next();
   }
   
   public void output()
   {
   	int n = 0;
   	Arrays.sort(list,0,count);
   	for(int i = 0; i < count; i++)
   	{
   		if(list[i].startsWith(letter))
   		{
   			System.out.println(list[i]);
   			n++;
   		}

   }
      	System.out.println("The names of " + n + " animals in the list begin with the letter " + letter + ".");
   }  
}
