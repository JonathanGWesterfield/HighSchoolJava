import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab07
{
	private String sizeOfPopcorn;
	private int sizeOfDrink;
	private double totalCost;
	
	public static void main (String[] args) {
    	Lab07 lab = new Lab07();
    	lab.input();
    	lab.process();
    	lab.output();
    }
	    
	public void input() {
		Scanner reader = new Scanner(System.in);
	    System.out.print("Enter the size of the popcorn <Small, Medium, Large>: ");
	    sizeOfPopcorn = reader.next();
	    System.out.print("Enter the size of the soft drink <8, 16, 32>: ");
	    sizeOfDrink = reader.nextInt();
	}
	    
	    public void process()
	    {
	    	if(sizeOfPopcorn.equalsIgnoreCase("SMALL"))
	    		totalCost = 3.0;
	    	else if(sizeOfPopcorn.equalsIgnoreCase("MEDIUM"))
	    		totalCost = 3.50;
	    	else
	    		totalCost = 4.25;
	    	if(sizeOfDrink == 8)
	    		totalCost += 2.75; 	//totalCost = totalCost + 2.75
	    	else if(sizeOfDrink == 16)
	    		totalCost += 3.25;
	    	else
	    		totalCost += 4.0;
	    }
	    
	    
	    
	public void output() {
    	DecimalFormat df = new DecimalFormat("$#.00");
    	System.out.println( "A " + sizeOfPopcorn + " box of popcorn and a " +
							sizeOfDrink + " oz soft drink costs " +
							df.format(totalCost));
	}
		
	
	
	
	
}