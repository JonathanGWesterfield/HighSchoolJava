import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab12
{
	private int width1;
	private int height1;
	private double width2;
	private double height2;

	public static void main(String[] args) {
		Lab12 lab = new Lab12( );
		lab.input();	// Enter data from the kybd
		lab.output( );	// Display output
	}
	
	public void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter an integer value for the width of a rectangle: ");
		width1 = reader.nextInt();
		System.out.print("Enter an integer value for the height of a rectangle: ");
		height1 = reader.nextInt();
			
		System.out.print("Enter a double value for the width of a rectangle: ");
		width2 = reader.nextDouble();
		System.out.print("Enter a double value for the height of a rectangle: ");
		height2 = reader.nextDouble();
	}
	
	public void output()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("The area of a rectangle with a width of " + width1+
			" and a height of " + height1 + " is " + area(width1,height1) + ".");
		System.out.println("The area of a rectangle with a width of " + width2 + "and a height of " + height2 +
			df.format(area(width2, height2)) + ".");
	}
	
	public static int area(int a, int b)
	{
		return a*b;
	}
	
	public static double area(double a, double b)
	{
		return a*b;
	}
	
	/* Write the area method here */
	
	
	/* Write the overloaded area method here */
	
}
