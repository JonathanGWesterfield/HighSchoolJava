//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Lab15C
{
	private int[] list = new int[500];
	private int count = 0;
	
	public static void main (String[] args) 
	{
    	Lab15C lab = new Lab15C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	int number = reader.nextInt();
    	while(number!=-99)
    	{
    		list[count++] = number;
    		System.out.print("Enter a number: ");
    		number = reader.nextInt();
    	}
    }
    
    public int sum(int list[])
    {
    	int sum = 0;
    	for(int i = 0; i<count; i++)
    	{
    		sum = sum + list[i];
    	}
    	return sum;
    }
    
    public double average(int list[])
    {
    	return sum(list) / count;
    }
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.#");
    	System.out.println("The sum of the " + count + " numbers is " + sum(list));
    	System.out.println("The average of the " + count + " numbers is " + df.format(average(list)));
    }
}