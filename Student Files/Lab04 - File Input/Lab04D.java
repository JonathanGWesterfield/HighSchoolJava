//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab04D
{
	private double a;
	private double b;
	private double c;
	private double d;
	
	public static void main(String[]args)
	{	
		Lab04D lab = new Lab04D();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab04d.dat"));
			reader.useDelimiter(",|\r\n");
			a = reader.nextDouble();
			b = reader.nextDouble();
			c = reader.nextDouble();
			d = reader.nextDouble();
		}
		
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void output()
	{
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println((int)a + "+" + (int)b + "=" + (int)(a+b));
		System.out.println((int)a + "-" + (int)b + "=" + (int)(a-b));
		System.out.println((int)a + "*" + (int)b + "=" + (int)(a*b));
		System.out.println((int)a + "/" + (int)b + "=" + df.format(a/b) + "\n");
		System.out.println((int)c + "+" + (int)d + "=" + (int)(c+d));
		System.out.println((int)c + "-" + (int)d + "=" + (int)(c-d));
		System.out.println((int)c + "*" + (int)d + "=" + (int)(c*d));
		System.out.println((int)c + "/" + (int)d + "=" + df.format(c/d) +"\n");
	}
}
		
		
		