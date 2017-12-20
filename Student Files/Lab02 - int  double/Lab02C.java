//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab02C
{
	final double PI = 3.1416;
	private double diameter;
	private double area;
	
	public static void main(String[]args)
	{
		Lab02C lab = new Lab02C();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the diameter of the circle: ");
		diameter = reader.nextDouble();
	}
	
	public void process(){
		area = ((diameter / 2) * (diameter / 2)) * PI;
	}
	
	public void output(){
		DecimalFormat df = new DecimalFormat ("#.00");
		System.out. println("The area of a circle with a diameter of " + diameter + " is " + df.format(area) + ".");
	}
}