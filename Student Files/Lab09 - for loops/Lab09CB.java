//Jonathan Westerfield

import java.util.Scanner;

public class Lab09CB
{
	private String sentence;
	
	public static void main(String[] args) 
	{
    	Lab09CB lab = new Lab09CB();
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
    	for(int i = sentence.length()- 1 ; i >= 0 ; i--)
    		System.out.print(sentence.charAt(i));
    		System.out.println( );
    }
    
    
}