//Jonathan Westerfield

import java.util.Scanner;

public class Lab03A
{
	private String firstword;
	private String secondword;
	private String thirdword;
	
	public static void main(String[]args)
	{
		Lab03A lab = new Lab03A();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter three words: ");
		firstword = reader.next();
		secondword = reader.next();
		thirdword = reader.next();
	}
	
	public void output()
	{
		System.out.println(thirdword + " " + secondword + " " + firstword);
		
		
	}
}
		