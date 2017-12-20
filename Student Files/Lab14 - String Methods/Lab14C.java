//Jonathan Westerfield

import java.io.*;
import java.util.Scanner;

public class Lab14C
{
	private String sequence;
	
	public static void main (String[] args) 
	{
		for(int i = 0; i <= 3; i++)
		{
    		Lab14C lab = new Lab14C();
    		lab.input();
    		lab.process();
    		lab.output();
		}
    }
    
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a sequence of nine(9) numbers: ");
    	sequence = reader.next();
    }
    
    
    
    public static boolean isEven(char a)
    {
    	return("2468".indexOf(a)>-1);
    }
    
    
    public void process()
    {
    	for(int i = 0; i< sequence.length()-1; i++)
    	{
       		if(isEven(sequence.charAt(i))&& isEven(sequence.charAt(i+1)))
    		{
    			if(sequence.charAt(i) > sequence.charAt(i+1))
    				sequence = sequence.substring(0,i+1) + "X" + sequence.substring(i+1);
    			else
    				sequence = sequence.substring(0,i+1) + "Z" + sequence.substring(i+1);
    		}
    	}
    }
    
    
    public void output()
    {
    	System.out.println(sequence);
    }
}