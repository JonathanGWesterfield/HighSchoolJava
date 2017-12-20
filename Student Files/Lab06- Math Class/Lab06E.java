//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab06E
{
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double distance;
		
	
	public static void main(String[] args) 
	{
    	Lab06E lab = new Lab06E();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the x and y coordinate for the first point: ");
    	x1 = reader.nextDouble();
    	y1 = reader.nextDouble();
    	System.out.print("Enter the x and y coordinate for the second point: ");
    	x2 = reader.nextDouble();
    	y2 = reader.nextDouble();
    }
    
    public void process()
    {
    	distance = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1,2));
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.#");
    	System.out.println("The distance between the points(" + (int)x1 + "," + (int)y1 + ") and (" + (int)x2 + "," + (int)y2 + ") is " + df.format(distance) + ".");
    }
}
