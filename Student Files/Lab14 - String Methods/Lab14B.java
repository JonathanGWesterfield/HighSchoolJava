//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Lab14B
{
	private String[] word = new String[200];
	private int count = 0;
	
	public static void main (String[] args) 
	{
    	Lab14B lab = new Lab14B();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("lab14b.dat"));
    		while(reader.hasNext())
    			word[count++] = reader.next();
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    }
    
    public static String correctspelling(String word)
    {
    	int index  = word.indexOf("ei");
    	while(index!= -1)
    	{
    		word = word.substring(0,index) + "ie" + 
    			word.substring(index +2);
    		index = word.indexOf("ei");
    	}
    	
    	index = word.indexOf("cie");
    	while(index!= -1)
    	{
    		word = word.substring(0,index) + "cei" + 
    			word.substring(index +3);
    		index = word.indexOf("cie");
    	}
    	return word;
    }
    public void output()
    {
    	
    	for(int i = 0; i<count; i++)
    	{
    		String corrected = correctspelling(word[i]);
    		if(word[i].equals(corrected))
    		{
    			System.out.println("The word \"" + word[i] + "\" is spelled correctly.");
    		}
    		
    		else
    		{
    			System.out.println("The word \"" + word[i] + "\" is spelled incorrectly.");
    			System.out.println("It should be spelled \"" + word[i]+ "\".");
    		}
    		
    	}
    }
}