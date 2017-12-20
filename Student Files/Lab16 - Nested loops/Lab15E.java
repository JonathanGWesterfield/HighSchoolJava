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
    
    public void output()
    {
    }
}