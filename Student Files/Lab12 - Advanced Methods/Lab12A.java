//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class Lab12A
{
	private int kilometers;
	
	public static void main (String[] args) 
	{
    	Lab12A lab = new Lab12A();
    	lab.input();
    	lab.output();	
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the speed limit in kilometers per hour: ");
    	kilometers = reader.nextInt();
    }
    
    public void output()
    {
        DecimalFormat df = new DecimalFormat("#.#");
    	System.out.println(kilometers + " kilometers per hour = " + df.format(kilometerstomiles(kilometers))
    		+ " miles per hour.");
    }
    
    public static double kilometerstomiles(int kilometers)
    {
        return kilometers * .6214;
    }
}