//Jonathan Westerfield

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Lab15D
{
	String[] item = new String[50];
	double[] prices = new double[50];
	int count = 0;
	
	public static void main (String[] args) 
	{
    	Lab15D lab = new Lab15D();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the name of an item: ");
    	String item = reader.next();
    	while(!item.equalsIgnoreCase("quit"))
    	{
    		this.item[count] = item;
    		System.out.print("Enter the price for " + item + ":");
    		prices[count++] = reader.nextDouble();
    		System.out.print("Enter the next Item: ");
    		item = reader.next();
    	}
    		
    }
    
    public double totalcost(double[] prices)
    {
    	double sum = 0;
    	for(int i = 0; i< count; i++)
    	{
    		sum = sum+prices[i];
    	}
    	return sum;
    }
   
    public void output()
    {
    	System.out.println("At the market you bought:");
    	for(int i = 0; i< count; i++)
    	{
    		System.out.println(item[i]+ " for " + prices[i]);
    	}	
    	System.out.println("The total cost was " + totalcost(prices));
    }
}