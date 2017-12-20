//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab12C
{
	private double ab;
	private double ac;

	
	public static void main (String[] args) 
	{
    	Lab12C lab = new Lab12C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the distance from A to B: ");
    	ab = reader.nextDouble();
    	System.out.print("Enter the distance from A to C: ");
    	ac = reader.nextDouble();
    }
    
    public static double area(double ab, double ac)
    {
     	
     	double bc = Math.sqrt(Math.pow(ac,2) - Math.pow(ab,2));
     	return bc*ab;
     	
    }
    
    public void output()
    {
    	
    	DecimalFormat df = new DecimalFormat("#.#");
    	System.out.println("The area of the rectangle where AB is " +ab + " and AC is " + ac + " is " + df.format(area(ab, ac)));
    }
    
    
}