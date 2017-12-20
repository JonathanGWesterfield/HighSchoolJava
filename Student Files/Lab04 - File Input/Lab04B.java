//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab04B
{
	private String first;
	private String second;
	private String third;
	
	public static void main(String[]args)
	{
		Lab04B lab = new Lab04B();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab04b.dat"));
			reader.useDelimiter(",");
			first = reader.next();
			second = reader.next();
			third = reader.next();
		}
		
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void output()
	{
		System.out.println(first + "\t" + second + "\t" + third);
		System.out.println(first + "\t" + third + "\t" + second);
		System.out.println(second + "\t" + first + "\t" + third);
		System.out.println(second + "\t" + third + "\t" + first);
		System.out.println(third + "\t" + first + "\t" + second);
		System.out.println(third + "\t" + second + "\t" + first);
	}
}