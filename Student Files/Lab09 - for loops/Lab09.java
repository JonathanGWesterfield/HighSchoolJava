//Jonathan Westerfield

import java.util.Scanner;

public class Lab09
{
	private String word;
	
	public static void main(String[] args) 
	{
    	for(int i = 0 ; i < 3 ; i++)
    	{
    		Lab09 lab = new Lab09();
    		lab.input();
    		lab.output();
    	}
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a word: ");
    	word = reader.next();
    }
    
    public void output()
    {
    	int n  = word.length();
    	for(int i = 0 ; i < n ; i++)
    		System.out.print("*");
    		System.out.println( );
    	
    }
}
