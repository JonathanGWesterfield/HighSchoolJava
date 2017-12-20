//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;


public class Lab04A
{
	private String name;
	private int age;
	private int year;
	
	public static void main(String[]args)
	{
		Lab04A lab = new Lab04A();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("Lab04a.dat"));
			reader.useDelimiter("/");
			name = reader.next();
			age = reader.nextInt();
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void process()
	{
		year = 2014 - age;
	}
	
	public void output()
	{
		System.out.println(name + " you were born in " + year + ".");
	}
}