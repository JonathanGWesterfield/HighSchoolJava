//Jonathan Westerfield

import java.io.*;
import java.util.Scanner;

public class Lab05B
{
	private int a;
	private int b;
	private int c;
	private int tens;
	private int ones;
	
	public static void main(String[] args)
	{
    	Lab05B lab = new Lab05B();
    	lab.input();
    	lab.process();
    	lab.output();	
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter three integers: ");
    	a = reader.nextInt();
    	b = reader.nextInt();
    	c = reader.nextInt();
    }
    
    public void process()
    {
    	tens = (a / 10) + (b / 10) + (c / 10);
    	ones = (a % 10) + (b % 10) + (c % 10);
    }
    
    public void output()
    {
    	System.out.println("Tens = " + tens);
    	System.out.println("Ones = " + ones);
    }
}