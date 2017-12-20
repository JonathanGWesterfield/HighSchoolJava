//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab02D
{
	final double PI = 3.1416;
	private double radius;
	private double area;
	private double volume;
	
	public static void main(String[]args)
	{ 
		Lab02D lab = new Lab02D();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		radius  = reader.nextDouble();
	}
	
	public void process(){
		area = ((radius * radius) * PI * 4);
		volume = ((radius * radius * radius) * PI * 4/3.0);
	}
	
	public void output(){
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The surface area of a crcle with a radius of " + radius + " is " + df.format(area) + ".");
		System.out.println("The volume of a shpere with radius of " + radius + " is " + df.format(volume) + ".");
	}
}