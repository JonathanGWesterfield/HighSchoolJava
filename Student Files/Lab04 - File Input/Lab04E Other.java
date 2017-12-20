//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab04EOther
{
	private double a;
	private double b;
	
	public static void main(String[]args)
	{
		Lab04EOther lab = new Lab04EOther();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab4e.dat"));
			a = reader.nextInt();
		}
		
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void output()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The whole part is " + (int)a + ".");
		System.out.println("the fractional part is " + (a - (int)a) + ".");
	}
}