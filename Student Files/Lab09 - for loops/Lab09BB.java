//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab09BB
{
	private int a;
	private int b; 
	private double average;
	int sum = 0;
	
	public static void main(String[] args) 
	{
    	Lab09BB lab = new Lab09BB();
    	lab.input();
    	lab.process();
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
    
    public void process()
    {
    	
    	int count = 0;
    	int large = Math.max(a , b);
    	
    	for(int i = Math.min(a , b) ; i <= large ; i++)
    	{
    		if(i % 2 == 0 && i % 5 != 0)
    		{
    			count++;
    			sum = sum + i;
    		}
    		average = (double)sum / count;
    	} 
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat(".#");
    	System.out.println("The sum of the even numbers between " + a 
    		+ " and " + b + " (excluding multiples of 5) is " + sum);
    	System.out.println("The average of the even numbers " + 
    		"(excluding multiples of 5) is " + df.format(average));
    }
}