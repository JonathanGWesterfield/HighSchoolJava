//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
public class FamousPlaces
{
	private City[] city1 = new City[20];
	private City[] city2 = new City[20];
	private int count;
	
	public static void main (String[] args) 
	{
    	FamousPlaces f = new FamousPlaces();
    	f.input();
    	f.output();
    }
    
    public void input()
    {
    	try
    	{
    		Scanner reader = new Scanner(new File("city1.dat"));
    		while(reader.hasNext())
    		{
    			String name = reader.next();
    			String location = reader.next();
    			city1[count++] = City(name,location);
    		}
    		reader = new Scanner(new File("city2.dat"));
    		count = 0;
    		while(reader.hasNext())
    		{
    			String name = reader.next();
    			String location = reader.next();
    			city2[count++] = new City(name,location);
    		}
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    }
    
    output()
    {
    	for(int i =0; i<count;i++)
    	{
    		if(city1[i].equals(city2[i]))
    		{
    			System.out.println(city1[i] + " is the same as " + ciyt2[i]);
    		}
    		else
    		{
    			System.out.println(city1[i] + " is not the same as " + ciyt2[i]);
    		}
    	}
    }
    
}