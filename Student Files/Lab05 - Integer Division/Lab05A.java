//Jonathan Westerfield

import java.util.Scanner;

public class Lab05A
{
	private int dividend;
	private int divisor;
	private int quotient;
	private int remainder;
	
	public static void main(String[] args)
	{
		Lab05A lab = new Lab05A();
		lab.input();
		lab.process();
		lab.output();
    }
	
	public void input()
	{
		Scanner reader  = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		dividend = reader.nextInt();
		divisor = reader.nextInt();
	}
		
	public void process()
	{
		quotient = dividend / divisor;
		remainder = dividend % divisor;	
	}
		
	public void output()
	{
		System.out.println(dividend + " divided by " + divisor + " equals " + quotient + " with a remainder of " + remainder + ".");
	}
}