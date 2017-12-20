//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab16E
{
	int height;
	
	public static void main (String[] args) 
	{
    	Lab16E lab = new Lab16E();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the height of the rocket ship: ");
    	height = reader.nextInt();
    }
    public void spaces(int n)
    {
    	for(int i = 0; i<n; i++)
    		System.out.print(" ");
    }
    public void tip()
    {
    	spaces(height*2);
    	System.out.println("/\\");
    }
    
    public void fslash(int n)
    {

    		for(int x=1; x <= n; x++)
    		{
				System.out.print("/");
    		}

    }
    
    public void bslash(int n)
    {
    
    		for(int x=1; x <= n; x++)
    		{
    			System.out.print("\\");
    		}
   
    }
    
    public void cone()
    {
    	for(int y = 1; y <= (height*2)-1; y++)	
    	{
    		spaces((height*2)-y);
    		fslash(y);
    		System.out.print("**");
    		bslash(y);	
    		System.out.println();
    	}
    }
    
    public void belt()
    {
    	System.out.print("+");
    	for(int y = 0; y<= (height*2)-1; y++)
    	{
    		System.out.print("=*");
    	}
    	System.out.println("+");
    	
    }
    
    public void period(int n)
    {
    	for(int i = 0; i<n; i++)
    		System.out.print(".");
    }
    
    
    public void upcone()
    {
    	for(int y = 1; y<=height; y++)
    	{
    		System.out.print("|");
    		for(int z = 1; z<=2; z++)
    		{
    			period((height-y));
    			for(int x = 1; x<= y; x++)
    			{
    				System.out.print("/\\");
    			}
    			period(height-y);
    		}
    		System.out.println("|");	
    		
    				
    	}
    	
    }
    public void downcone()
    {
    	for(int y = height; y>0; y--)
    	{
    		System.out.print("|");
    		for(int z = 1; z<=2; z++)
    		{
    			period((height-y));
    			for(int x = y; x>0; x--)
    			{
    				System.out.print("\\/");
    			}
    			period(height-y);
    		}
    		System.out.println("|");
    			
    		
    				
    	}
    }
    
    
    public void output()
    {
    	tip();
    	cone();
    	belt();
    	upcone();
    	downcone();
    	belt();
    	downcone();
    	upcone();
    	belt();
    	cone();
    }
}