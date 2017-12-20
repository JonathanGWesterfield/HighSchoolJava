//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
import java.util.Arrays;

public class Lab10_5B
{
	private int[] list = new int[500];
	private int count = 0;
	private double mean = 0;
	private double median = 0;
		
	public static void main (String[] args) 
	{
    	Lab10_5B lab = new Lab10_5B();
    	lab.input();
    	lab.process();
    	lab.output();
   }
   
   public void input()
   {
   		try
   		{
   			Scanner reader = new Scanner(new File("numbers1.dat"));
   			while(reader.hasNextInt())
   				list[count++] = reader.nextInt();
   		}
   	
   		catch(IOException e)
   		{
   			System.out.print(e);
   			System.exit(0);
   		}
   }
 
   
  
   public void process()
   {
   		int sum = 0;
   		Arrays.sort(list,0,count);
   		if(count % 2 == 0)
   		{
   			median = (double)(list[count/2]+ list[(count/2)-1])/2;
   		}
   		
   		else
   		{
   			median = (double)list[count/2];
   		}
   		
   		for( int i=0; i<list.length-1;i++)
   		{
   			sum = sum+list[i];
   		}
   		mean = sum/count;
   }
   
   
   public void output()
   {
   	DecimalFormat df = new DecimalFormat(".#");
   	System.out.println("The smallest value is "+ list[0]);
   	System.out.println("the largest value is " + list[count-1]);
   	System.out.println("The mean value is " + mean);
	System.out.println("The median value is " + median);
   }
}
  