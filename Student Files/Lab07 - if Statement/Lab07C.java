//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab07C
{
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	public static void main(String[] args) 
	{
    	Lab07C lab = new Lab07C();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the coordinates for the first point: ");
    	x1 = reader.nextDouble();
    	y1 = reader.nextDouble();
    	System.out.print("Enter the coordinate for the second point: ");
    	x2 = reader.nextDouble();
    	y2 = reader.nextDouble();
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.###");
    	if(x1 == x2)
    		System.out.println("The slope of the line containing (" + (int)x1 + "," + (int)y1 + ") and (" + (int)x2 + "," + (int)y2 + ") is undefined.");
    	else if(y1 == y2)
    		System.out.println("The slope of the line containing (" + (int)x1 + "," + (int)y1 + ") and (" + (int)x2 + "," + (int)y2 + ")is zero.");
    	else
    		System.out.println("The slope of the line containing (" + (int)x1 + "," + (int)y1 + ") and (" + (int)x2 + "," + (int)y2 + ")is " + df.format((y2 - y1) / (x2 - x1)) + ".");
    }
}
