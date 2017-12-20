//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab17D
{
	char[] str;
	

 	public static void main(String[ ] args) 
	{
		Lab17D lab = new Lab17D();
		lab.input();	
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
			str = reader.nextLine().toCharArray();
	}
	
	public void output()
	{
		for(int i = 0; i<str.length; i++)
		{
			if(Character.isDigit(str[i]))
				System.out.println("'"+ str[i] + "'" + " is a number.");
			else if(Character.isWhitespace(str[i]))
				System.out.println("'"+str[i]+"'" + " is white space.");
			else if(Character.isLetter(str[i]))
				System.out.println("'"+str[i]+ "'" + " is a letter.");
			else
				System.out.println("'" + str[i]+ "'" + " is a symbol.");
		}
		
	}
}