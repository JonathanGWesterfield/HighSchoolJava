//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab08B
{
	private int numstars;
	
	public static void main(String[] args) 
	{
    	Lab08B lab = new Lab08B();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the number of stars to display: ");
    	numstars = reader.nextInt();
    }
    
    
    public void output()
    {
    	System.out.print(numstars + " stars: "); 
    	int lcv= 1;
    	while(lcv < numstars)
    	{
    		System.out.print("*");
    		++lcv;
    	}
    }
    
}