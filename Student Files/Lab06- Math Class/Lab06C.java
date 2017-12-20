//Jonathan Westerfield

import java.util.Scanner;

public class Lab06C
{
	final int boardsize = 32;
	private int area;
	private int boards;
	
	public static void main(String[] args) 
	{
    	Lab06C lab = new Lab06C();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the number of square feet: ");
    	area = reader.nextInt();
    }
    
    public void process()
    {
    	boards = (int)Math.ceil((double)area / boardsize);
    }
    
    public void output()
    {
    	System.out.println("A storage shed requiring " + area + " square feet plywood will need " + boards + " sheets of plywood to finish the job.");
    }
}