//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab08A
{
	
	public static void main(String[] args) 
	{
    	Lab08A lab = new Lab08A();
    	lab.output();
    }
    
    public void output()
    {
    	int lcv = 1;
    	while (lcv <= 20)
    	{
    		System.out.print(lcv++ + " ");
    	}
    		
    }
}