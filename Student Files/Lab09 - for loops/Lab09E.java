//Jonathan Westerfield	

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab09E
{
	private double verses;
	
	public static void main(String[] args) 
	{
    	Lab09E lab = new Lab09E();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the number of verses to display: ");
    	verses = reader.nextDouble();
    	System.out.println();
    }
    
    public void output()
    {
    	int bottles = 99;
    	for(double a = verses; a > 0; a--)
    	{
    		System.out.print(bottles + " bottles of beer on the wall\n" + bottles + " bottles of beer\nIf one of those bottles should happen to fall\n" + --bottles + " bottles of beer on the wall\n\n");
    	}
    }
}
