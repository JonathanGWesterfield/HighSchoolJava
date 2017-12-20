//Jonathan Westerfield

import java.util.Scanner;

public class Lab09AB
{
	private int goblins;

	public static void main(String[] args) 
	{
    	Lab09AB lab = new Lab09AB();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the number of Goblins to display: ");
    	goblins = reader.nextInt();
    }
    
    public void output()
    {
    	System.out.print("Ther be goblins her: ");
    	final char gob = 1;
    	for(int a = 0 ; a < goblins ; a++)
    	{
    		System.out.print(gob);
    	}
    		System.out.println();
    }
    
}