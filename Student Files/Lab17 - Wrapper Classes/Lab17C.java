//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab17C
{
	private int decimal;
	char format;

 	public static void main(String[ ] args) 
	{
		Lab17C lab = new Lab17C();
		lab.input();	
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Number Systems\nB - Decimal to Binary\nO - Decimal to Octal\nH - Decimal to Hexadecimal\nConversion Format: ");
		format = reader.next().charAt(0);
		System.out.print("Enter the number to convert: ");
		decimal = reader.nextInt();
	}
	
	public void output()
	{
		switch(format)
		{
			case 'b':
			case 'B':
				System.out.println(decimal + " (Base 10) = " + Integer.toBinaryString(decimal) + " (Base 2)");
			break;
			case 'o':
			case 'O':
			System.out.println(decimal + " (Base 10) = " + Integer.toOctalString(decimal) + " (Base 8)");
			break;
			case 'H':
			case 'h':
			System.out.println(decimal + " (Base 10) = " + Integer.toHexString(decimal) + " (Base 16)");
			break;
		}
			
	}
}