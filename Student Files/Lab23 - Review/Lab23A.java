//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab23A
{
  double radius;
  double height;
  
  public static void main(String[] args)
  {
    Lab23A lab = new Lab23A();
    lab.input();
    lab.output();
  }
  
  public void input()
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter the radius of the base: ");
    radius = reader.nextInt();
    System.out.print("Enter the height of the cone: ");
    height = reader.nextInt();
  }
  
  public void output()
  { DecimalFormat df = new DecimalFormat("#.#");
    System.out.println("The surface area of a cone with a radius of " + (int)radius + " and a height of " + (int)height + " is " + df.format(area(radius, height)) + ".");
    System.out.println("The volume of a cone with a radius of " + (int)radius + " and a height of " + (int)height + " is " + df.format(volume(radius, height)) + ".");
  }
  
  public static double area(double radius, double height)
  { double area;
    area = Math.PI*radius*(Math.hypot(radius,height)) + (Math.PI*Math.pow(radius,2)); 
    return area; 
  }
  
  public static double volume(double radius, double height)
  {
    double volume;
    volume = (1.0/3.0)*Math.PI*Math.pow(radius,2)*height;
    return volume;
  }
  
}