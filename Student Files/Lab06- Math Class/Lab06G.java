//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab06G
{
	private double a;
	private double b;
	private double angle;
	private double thirdside;
	
	public static void main(String[] args) 
	{
    	Lab06G lab = new Lab06G();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the lengths of two sides and their included angle: ");
    	a = reader.nextDouble();
    	b = reader.nextDouble();
    	angle = reader.nextDouble();
    }
    
    public void process()
    {
    	thirdside = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * a * b * Math.cos(Math.toRadians(angle)));
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.##");
    	System.out.println("A trianlge with sides of length " + a + " and " + (int)b + " and an included angle measuring " + (int)angle + " degrees has a third side of length " + df.format(thirdside) + ".");
    }
}