//Jonathan Westerfield

import java.util.Scanner;

public class Lab06A
{
	private int a;
	private int b;
	private int distance;
	
	public static void main(String[] args) 
	{
    	Lab06A lab = new Lab06A();
    	lab.input();
    	lab.process();
    	lab.output();	
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter two numbers: ");
    	a = reader.nextInt();
    	b = reader.nextInt();
    }
    
    public void process()
    {
    	distance = Math.abs(b - a);
    }
    
    public void output()
    {
    	System.out.println("The distance from " + a +" to " + b + " is " + distance + ".");
    }
}