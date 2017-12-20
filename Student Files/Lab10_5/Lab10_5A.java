//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class Lab10_5A
{
	private long[] fibonacci = new long[50]; 
		
	public static void main (String[] args) 
	{
    	Lab10_5A lab = new Lab10_5A();
    	lab.process();
    	lab.output();
   }
   
  
   
   public void process()
   {
  		fibonacci[0] = 0;
  		fibonacci[1] = 1;
  		for(int i = 2; i < 90; i++)
  		{
  			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
  		}
  		
   }
   
   
   public void output()
   {
   		for(int i = 0; i<fibonacci.length ; i++)
   		{
   			System.out.print(fibonacci[i] + " ");
   		}
   }
}