//Jonathan Westerfield

import java.util.Scanner;

public class Lab09DB
{
	private char firstlet;
	private char seclet;
	public static void main(String[] args) 
	{
    	Lab09DB lab = new Lab09DB();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the first character: ");
    	firstlet = reader.next().charAt(0);
    	System.out.print("Enter the second character: ");
    	seclet = reader.next().charAt(0);
    }
    
    public void output()
    {
    	if(firstlet < seclet)
    	{
    		int count = 0;
    		System.out.println();
    		System.out.print("The Alphabet from " + firstlet +
    				" to " + seclet + ": "); 
    		for(char c = firstlet ; c <= seclet ; c++)
    		{ 
    			System.out.print(c +" "); 	
    				count++;
    		}
    		System.out.println();
    		System.out.println("There are " + count + " characters from "
    			+ firstlet + " to " + seclet + ".");
    		System.out.println();
    	}
    	
    	else
    	{
    		int count = 0;
    		System.out.println();
    		System.out.print("The Alphabet from " + firstlet +
    				" to " + seclet + ": ");
    		for(char c = firstlet ; c >= seclet ; c--)
    		{
    			System.out.print(c + " ");
    			count++;
    		}
    		System.out.println();
    		System.out.println("There are " + count + " characters from "
    			+ firstlet + " to " + seclet + ".");
    		System.out.println();
    	}
    }
    
}
