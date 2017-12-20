//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab13
{
	private int[] list = new int[100];
	private int count;
	
	public static void main(String[ ] args) 
	{
		Lab13 lab = new Lab13( );
		lab.input();	// Read data from a datafile
		lab.output( );	// Display output
	}
	
	public void input() {
		try
		{
			Scanner reader = new Scanner(new File("lab13.dat"));
			while (reader.hasNextInt())
				list[count++] = reader.nextInt();
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void output()
	{
		System.out.println("the largest number is " + findmax(list,count)+ ".");
		System.out.println("The smalles number is " + findmin(list,count) + ".");
	}
	
	
	
	public int findmax(int list[], int size)
	{
		int max  = list[0];
		
		for(int i =1; i<size; i++)
		{
			if(list[i]>max)
				max = list[i];
		}
		return max;
	}
	
	public int findmin(int list[], int size)
	{
		int min = list[0];	
			
			for(int i = 1; i<size; i++)
			{
				if(list[i]<min)
					min = list[i];
			}
		return min;
	}
	
}
