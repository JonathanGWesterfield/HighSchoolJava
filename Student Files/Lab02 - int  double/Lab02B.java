//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab02B
{
	private double a;
	private double volume;
	
	public static void main(String[]args)
	{
		Lab02B lab = new Lab02B();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the length of one side of a cube: ");
		a = reader.nextDouble();
	}
	
	public void process(){
		volume = a * a * a;
	}
	
	public void output(){
		DecimalFormat df = new DecimalFormat ("#.0");
		System.out.println("The volume of a cube with a side length of " + a + " inches is " + df.format(volume) + " cubic inches.");
	}
}


