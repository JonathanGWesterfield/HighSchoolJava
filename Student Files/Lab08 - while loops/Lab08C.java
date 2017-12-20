//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab08C
{
	private int a;
	private int b;
	
	public static void main(String[] args) 
	{
    	Lab08C lab = new Lab08C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the first number: ");
    	a = reader.nextInt();
    	System.out.print("Enter the second number: ");
    	b = reader.nextInt();
    	
    }
    
    public void output()
    {
    	int lcv = Math.min(a , b);
    	int d = Math.max(a , b);
    	System.out.print("All the odd numbers between " + a + " and " + b + ":\n");
    	while(lcv <= d)
    	{
    		if(lcv % 2 != 0)
    			System.out.print(lcv + " ");
    		lcv++;
    		
    	}
    }
}