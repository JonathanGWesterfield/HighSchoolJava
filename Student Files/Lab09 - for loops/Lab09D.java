//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab09D
{
	private char firstletter;
	private char lastletter;
	
	public static void main(String[] args)
	{
    	Lab09D lab = new Lab09D();
    	lab.input();
    	lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the first character: ");
		firstletter = reader.next().charAt(0);
		System.out.print("Enter the second character: ");
		lastletter = reader.next().charAt(0);
	}
	
	public void output()
	{
		int count = 0;
		System.out.print("The Alphabet from " + firstletter + " to " + lastletter + ": ");
		if(firstletter < lastletter)
		{
			
			for(char c = firstletter; c <= lastletter; c++)
			{
				System.out.print(c+ " ");
				count++;
			}
			System.out.println();
			System.out.print("There are " + count + " characteres from " + firstletter + " to " + lastletter + ".");
			
			
		}
		else
		{
			for(char c = firstletter; c >= lastletter; c--)
			{
				System.out.print( c + " ");
				count++;
			}
			System.out.println();
			System.out.print("there are " + count + " characters from " + firstletter + " to " + lastletter + ".");
			
			
		}

	}
}