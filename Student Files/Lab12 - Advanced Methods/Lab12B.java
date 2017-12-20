 //Jonathan Westerfield
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab12B 
{
    private double radius;
    
    public static void main(String[] args)
    {
        Lab12B lab = new Lab12B();
        lab.input();
        lab.output();
    }
    
    public void input()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        radius = reader.nextDouble();
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("The area of a circle with a radius of " + radius + " is " + df.format(area(radius)));
        System.out.println("The circumference of a circle with a radius of " + radius + " is " + df.format(circumference(radius)));
    }
    
    public static double area(double radius)
    {
    	return Math.PI * Math.pow(radius , 2);
    }
    
    public static double circumference(double radius)
    {
    	return 2*Math.PI*radius;
    }
    
}
