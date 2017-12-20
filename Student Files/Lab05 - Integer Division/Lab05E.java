//Jonathan Westerfield

import java.util.Scanner;

public class Lab05E
{
	private double amount;
	private int cents;
	private int twenties;
	private int tens;
	private int fives;
	private int ones;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	public static void main(String[] args) 
	{
    	Lab05E lab = new Lab05E();
    	lab.input();
    	lab.process();
    	lab.output();	
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a monetary amount: ");
    	amount = reader.nextDouble();
    }
    
    public void process()
    {
    	cents = (int)(amount * 100); 
    	twenties = cents / 2000;
    	tens = (cents % 2000) / 1000;
    	fives = cents % 1000 /500;
    	ones = cents % 500 /100;
    	quarters = cents % 100 / 25;
    	dimes = cents % 25 / 10;
    	nickels = cents  % 25 % 10 / 5;
    	pennies = cents  % 5;   
    }
    
    public void output()
    {
    	System.out.println(amount + " = " + cents + " cents");
    	System.out.println(twenties + " =" + " twenties");
    	System.out.println(tens + " =" + " tens");
    	System.out.println(fives + " =" + " fives");
    	System.out.println(ones + " =" + " ones");
    	System.out.println(quarters + " =" + " quarters");
    	System.out.println(dimes + " =" + " dimes");
    	System.out.println(nickels + " =" + " nickels");
    	System.out.println(pennies + " =" + " pennies");
    }
    
}