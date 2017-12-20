//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab17B
{
	private int[] decimal = new int[20];
	private int count = 0;

 	public static void main(String[ ] args) 
	{
		Lab17B lab = new Lab17B( );
		lab.input();	
		
		lab.output( );
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab17b.dat")).useDelimiter("/|\r\n");;
			while(reader.hasNext())
			{
				decimal[count++] = reader.nextInt();
				
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
		for(int i = 0; i<count; i++)
		{
			System.out.println(decimal[i] + " (Base 10) = " + Integer.toBinaryString(decimal[i]) + " (Base 2)");
		}
	}
}
	