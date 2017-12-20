//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11B
{
	private int code;
	private int length;
	private double cost;
	
	public static void main (String[] args) 
	{
    	for(int i = 0; i<=3; i++)
    	{
    		Lab11B lab = new Lab11B();
    		lab.input();
    		lab.process();
    		lab.output();
    	}
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.println("Code Table:		Code			rate per minute");
    	System.out.println("		  	  1				0.22");
    	System.out.println("		  	  2				0.14");
    	System.out.println("		  	  3				0.73");
    	System.out.println("		  	  4				1.12");
    	System.out.println("		  	  5				2.38");
    	System.out.print("Enter a code number: ");
    	code = reader.nextInt();
    	System.out.print("Enter the length of the call: ");
    	length = reader.nextInt();
    }
    
    public void process()
    {
    	switch(code)
    	{	
    		case 1:
    			cost = length * .22;
    			break;
    		case 2:
    			cost = length * .14;
    			break;
    		case 3:
    			cost = length * .73;
    			break;
    		case 4:
    			cost = length * 1.12;
    			break;
    		case 5:
    			cost = length * 2.38;
    			break;
    	}	
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("##.00");
    	System.out.println("Your code " + code + " call for " + length + " costs $" + df.format(cost) + ".");
    }
}