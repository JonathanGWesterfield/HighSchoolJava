//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab02A
{
	private int a;
	private int b;
	private double c;
	
	public static void main(String [] args)
	{
		Lab02A lab = new Lab02A();
		lab.input();
		lab.inputA();
		lab.process();
		lab.output();
	}
	
	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the length of side a: ");
		a = reader.nextInt();
	}
	
	public void inputA(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the length of side b: ");
		b = reader.nextInt();
	}
	
	public void process(){
		c = ((a * b) / 2.0);
	}
	
	public void output(){
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The area of a right triangle with sides of length " + a + " inches and " + b + " inches is " + c + " square inches.");
	} 
	
}