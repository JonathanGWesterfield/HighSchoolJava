//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab06B
{
	private int s;
	private double r;
	private int a;
	private double area;
	private double volume;
	private double side;
	
	public static void main(String[] args) 
	{
    	Lab06B lab = new Lab06B();
    	lab.input();
    	lab.process();
    	lab.output();	
    }
    
    public void input()
    {
    	try
		{
			Scanner reader = new Scanner(new File("lab06b.dat"));
    		s = reader.nextInt();
    		r = reader.nextDouble();
    		a = reader.nextInt();
		
		}
		catch (IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}	
  
    
    public void process()
    {
    	area = Math.pow(s,2);
    	volume = ((4.0/3.0) * Math.PI * (Math.pow(r , 3)));
    	side = Math.sqrt( area );
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.##");
    	System.out.println("The area of a square whose side length is " + s + " is " + df.format(area) + ".");
    	System.out.println("The volume of a sphere whose radius is " + r + " is " + df.format(volume) + ".");
    	System.out.println("The side length of a square whose area is " + a + " is " + df.format(side) + ".");
    }
}