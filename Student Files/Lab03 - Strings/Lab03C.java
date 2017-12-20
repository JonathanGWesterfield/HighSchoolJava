//Jonathan Westerfield

import java.util.Scanner;

public class Lab03C
{
	private String sentence;

	public static void main(String[]args)
	{
		Lab03C lab = new Lab03C();
		lab.input();
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sentence = reader.nextLine();
	}
	
	public void output()
	{
		System.out.println(sentence + " Contains " + sentence.length() + " Characters");
		System.out.println("The first character is " + "'" + sentence.charAt(0) + "' and the last character is " + "'" + sentence.charAt(sentence.length()-1) + "'"); 
	}
}