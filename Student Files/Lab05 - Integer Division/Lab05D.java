//Jonathan Westerfield

import java.util.Scanner;

public class Lab05D
{
	private int number;
	private int thousands;
	private int hundreds;
	private int tens;
	private int ones;
	
	public static void main(String[] args) 
	{
    	Lab05D lab = new Lab05D();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a four digit integer: ");
    	number  = reader.nextInt();
    }
    
    public void process()
    {
    	thousands = number / 1000;
    	hundreds = (number % 1000)/100;
    	tens =  ((number%1000)%100)/10;
    	ones = ((number%1000)%100)%10/1;
    }
    
    public void output()
    {
    	System.out.println(number + " equals\n" + thousands + " thousands");
    	System.out.println(hundreds + " hundreds");
    	System.out.println(tens	+ " tens");
    	System.out.println(ones + " ones");
    }
}