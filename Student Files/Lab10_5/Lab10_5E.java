//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab10_5E
{
	private char[] list = new char[500];
	
	public static void main (String[] args) 
	{
		Lab10_5E lab = new Lab10_5E();
		lab.input();
		lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a word: ");
    	list = reader.next().toCharArray();
    	
    }
    
    public void output()
    {
    	Arrays.sort(list);
     	{
    		System.out.print(list);
    	}
    	System.out.println();
    }
}
	