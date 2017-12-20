//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab03
{
	private double volume;
	private double surfaceArea;
	private String name;
	private String country;
	private double baseWidth;
	private double height;
	
	public static void main(String[]args)
	{
		Lab03 lab = new Lab03();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the name of the Pyramid: ");
		name  = reader.nextLine();
		System.out.print("Enter the Country of Origin: ");
		country = reader.nextLine();
		System.out.print("Enter the base width: ");
		baseWidth = reader.nextDouble();
		System.out.print("Enter the height: ");
		height = reader.nextDouble();
	}
	
	public void process()
	{
		volume = 1/3.0 * baseWidth * baseWidth * height;
		double sideLength = Math.hypot(baseWidth / 2, height);
		surfaceArea = 2 * baseWidth * sideLength;
	}
	
	public void output()
	{
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("\n" + name + " in " + country + " has a surface area of " + df.format(surfaceArea) + " square feet ");
		System.out.println("and a volume of " + df.format(volume) + " cubic feet.\n");
	}
}



