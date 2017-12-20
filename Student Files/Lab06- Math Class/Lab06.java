//Jonathan Westerfield

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab06
{
	private int diameter;
	private double areaOfSlice;

	
	public static void main(String[] args) 
	{
		Lab06 lab = new Lab06( );
		lab.input();	// Enter data from the kybd
		lab.process( );	// Calculate area of a slice
		lab.output( );	// Display output
	}
	
	public void input() 
	{
 		Scanner reader = new Scanner(System.in);
    	System.out.print("Enter the diameter of the pizza: ");
    	diameter = reader.nextInt();
	}
	
	public void process()
	{
		double radius = (double)diameter / 2;
		areaOfSlice = (Math.PI * Math.pow(radius , 2)) / 8;  
	}
	
	public void output() {
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println( "If a pizza has a diameter of " + diameter + 
							" inches then one slice has an area of " +
							df.format(areaOfSlice) + " square inches.");
	}
}
