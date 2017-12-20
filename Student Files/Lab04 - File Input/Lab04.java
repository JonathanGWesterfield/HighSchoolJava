import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab04
{
	private int quantity;
	private String description;
	private String unit;
	private double cost;
	private double price;
	private double profit;

	public static void main (String[] args)
	{
    	Lab04 lab = new Lab04();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
   	public void input()
   	{
   		try
   		{
   			Scanner reader = new Scanner(new File("inventory2.dat"));
   			reader.useDelimiter("/");
   			quantity = reader.nextInt();
   			description = reader.next();
   			unit = reader.next();
   			cost = reader.nextDouble();
   			price = reader.nextDouble();
   		}
   		
   		catch(IOException e)
   		{
   			
   			System.out.println(e);
   			System.exit(0);
   		}
   	}

    
    public void process() {
    	profit = quantity * (price - cost);
	}
	
	public void output() {
		DecimalFormat df = new DecimalFormat("$,###.00");
		System.out.println("The sale of " + quantity + " " + unit + " of " + description + " resulted in a profit of " + df.format(profit) + ".");
	}
	
}