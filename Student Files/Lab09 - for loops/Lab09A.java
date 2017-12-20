//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab09A
{
	private int goblins;
	public static void main(String[] args) 
	{
    	Lab09A lab = new Lab09A();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the number of Goblins to display: ");
    	goblins = reader.nextInt();
    }
    
    
    public void output()
    {
    	System.out.print("There be goblins here: ");
    	final char gob = 1;
    	for(int n = 0; n < goblins; n++)
    	{
    		System.out.print(gob);
    	}
    		System.out.println();
    }
}
