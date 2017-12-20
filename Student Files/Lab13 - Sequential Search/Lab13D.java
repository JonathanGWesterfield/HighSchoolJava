//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab13D
{
	private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October"
                ,"November","December"};
     
	private int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	private String month;
	
	public static void main (String[] args) 
	{
    	Lab13D lab = new Lab13D();
    	lab.input();
    	lab.output();
    }
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the name of a month: ");
    	month = reader.next();
    	
    }
    
    public static int indexof(String m)
    {
        for(int i = 0; i<months.length; i++)
        {
            if(m.equalsIgnoreCase(months[i]))
                return days[i];
            
        }
        return -1;
    }
    
    
    public void output()
    {  
       System.out.print(month);
       int days = indexof(month);
       if(days!=-1)
       {
           System.out.println(" has " + days + " days.");
       }
       else
       {
           System.out.println(" is not a valid name of a month");
       }
    }
}