//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab09C
{
	private String sentence;
	
	public static void main(String[] args)
	{
    	Lab09C lab = new Lab09C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.println("Enter a sentence:");
    	sentence = reader.nextLine();
    }
    
    public void output()
    {
    	for(int i = sentence.length() -1 ; i > 0; i--)
    		System.out.print(sentence.charAt(i));
    }
}