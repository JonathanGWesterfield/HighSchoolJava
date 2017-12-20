//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab04E
{
	private double a;
	private double b;
	
	public static void main(String[]args)
	{
		Lab04E lab = new Lab04E();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab4e.dat"));
			reader.useDelimiter(".|\r\n");
			a = reader.nextInt();
			b = reader.nextInt();
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
		System.out.println("the fractional part is " + df.format(b) + ".");
	}
}
