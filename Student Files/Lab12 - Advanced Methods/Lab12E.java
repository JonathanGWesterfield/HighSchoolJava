//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab12E
{
	private int distance;
	
	public static void main (String[] args) 
	{
    	Lab12E lab = new Lab12E();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the distance <in feet> to the ground: ");
    	distance = reader.nextInt();
    }
    
    public static double time(int distance)
    {
    	return 	Math.sqrt(distance*2/32.2);
    }
    
    public static double speed(int distance)
    {
    	return 32.2*Math.pow(time(distance), 2);
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.#");
    	System.out.println("It would take an object " + df.format(time(distance)) 
    		+ " seconds to fall " + distance + ".");
    	System.out.println("The object would be moving " + df.format(speed(distance))
    		+ " feet per second when it hit the ground.");
    }
}