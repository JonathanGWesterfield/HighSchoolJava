//Jonathan Westerfield
import java.util.*;
import java.io.*;

public class Lab10
{
	private int[] list = new int[100];
	private int count = 0;
	
	public static void main (String[] args) {
		Lab10 lab = new Lab10();
		lab.input();
		lab.output();
    }
    public void input() 
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("Lab10.dat"));
    		while(reader.hasNextInt())
    			list[count++] = reader.nextInt();
    			
    			
    		
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println (e);
    		System.exit(0);
    	}
    	
    }
    public void output()
    {
    	System.out.println("Negative Numbers:");
    	int nCount = 0;
    	for(int i = 0; i < count; i++)
    	{
    		if(list[i] < 0)
    		{
    			System.out.print(list[i]+ " ");
    			nCount++;
    		}
    	}
    	System.out.println ("\nThere were " + nCount + " negative numbers\n");
    	
    	int pCount = 0;
    	for(int i = 0; i < count; i++)
    	{
    		if(list[i] >= 0)
    		{
    			System.out.print(list[i] + " ");
    			pCount++;
    		}
    	}
    	System.out.println ("\nThere were " + pCount + " negative numbers.");
    }
    
    
}