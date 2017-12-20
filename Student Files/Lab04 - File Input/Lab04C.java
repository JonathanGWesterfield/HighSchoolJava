//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab04C
{
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	
	public static void main(String[]args)
	{
		Lab04C lab = new Lab04C();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab04c.dat"));
			reader.useDelimiter("\n");
			line1 = reader.next();
			line2 = reader.next();
			line3 = reader.next();
			line4 = reader.next();
		}
		
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		} 
	}
	
	public void output()
	{
		System.out.println(line4 + "\n" + line3 + "\n" + line2 + "\n" + line1);
	}
}
	