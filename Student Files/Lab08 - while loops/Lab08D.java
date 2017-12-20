//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab08D
{
	private int a;
	
	public static void main(String[] args) 
	{
    	Lab08D lab = new Lab08D();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter an integer: ");
    	a = reader.nextInt();
    }
    
    public void output()
    {
    	int lcv = 1;
    	while(lcv <= 10)
    	{
    		System.out.println(lcv + " * " + a + " = " + (lcv * a));
    		lcv++;
    	}
    }
}