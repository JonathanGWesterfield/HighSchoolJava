import java.util.Scanner;

/**
 * This program reads two integers from the keyboard and raises the first integer
 * to the power of the second integer, i.e. if the two numbers entered are 2 and 3
 * then 2 is raised to the power of 3 which equals 8.
 **/
public class ErrorProneEllie
{
	private int a;
	private int b;
	private int result;

	public static void main(String[] args) 
	{
    	ErrorProneEllie ellie = new ErrorProneEllie();
    	ellie.input();
    	ellie.process();
    	ellie.output();
    }

    public void input() 
    {
    	Scanner kybd = new Scanner(System.in);
    	System.out.println("Enter two integer values: ");
    	a = kybd.nextInt;
    	b = kybd.nextInt;
    }

    public void process() 
    {
    	result = Math.pow(a, b);
    }

    public void output() 
    {
    	System.out.println(a + "to the power of " + b + " is " + result);
    }
}