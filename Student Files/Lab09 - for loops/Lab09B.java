+
//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab09B
{
	private int firstnum;
	private int secnum;
	private int sum;
	private double average;
	
	public static void main(String[] args) 
	{
    	Lab09B lab = new Lab09B();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the first number: ");
    	firstnum = reader.nextInt();
    	System.out.print("Enter the second number: ");
    	secnum = reader.nextInt();
    }
    
    public void process()
    {
    	int count = 0;
    	int large = Math.max(firstnum, secnum);
    	for(int n = Math.min(firstnum , secnum); n <= large; n++)
    	{
    		if(n % 2 == 0 && n % 5 != 0)
    		{ 
    			count++;
    			sum = sum + n;
    		}
    	}
    	average = (double)sum / count;		
    			
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat(".#");
    	System.out.println("The sum of the even numbers between " + Math.min(firstnum , secnum) + " and " + Math.max(firstnum , secnum) + " (excluding multiples of 5) is " + sum + ".");
    	System.out.println("The average of the even numbers (excluding multiples of 5) is " + df.format(average) + ".");
    }
}
