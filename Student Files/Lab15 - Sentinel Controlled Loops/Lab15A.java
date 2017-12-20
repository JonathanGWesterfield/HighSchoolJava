//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab15A
{
	private int[] list = new int[9];
	private int count = 0;
	private int median;
	
	public static void main (String[] args) 
	{
    	Lab15A lab = new Lab15A();
    	lab.input();
    	lab.output();	
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the first integer (0 to quit): ");
    	int integer = reader.nextInt();
    	while(integer !=0)
    	{
    		list[count++] = integer;
    		System.out.print("Enter an integer (0 to quit): ");
    		integer = reader.nextInt();
    		
    	}
    }
    
    public int median(int list[])
    {
    	Arrays.sort(list,0, count);
    	if(count%2 == 0)
    		return (list[count/2] + list[(count/2)-1]) /2;
    	else
    		return list[count/2];
    }
    
    public void output()
    {
    	
    	System.out.println("The smallest value is " + list[0] + ".");    
    	System.out.println("The largest value is " + list[count-1]+ ".");
    	System.out.println("The median value is " + median(list) + ".");
    }
}
