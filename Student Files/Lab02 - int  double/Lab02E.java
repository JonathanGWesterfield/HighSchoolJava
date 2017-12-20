//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab02E
{
	private final double tax = .0825;
	private double a;
	private double a1;
	private double price;
	
	public static void main(String[]args)
	{
		Lab02E lab = new Lab02E();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter The Price For The Computer System: $");
		a = reader.nextDouble();
	}
	
	public void process(){
		a1 = a * tax;
		price = (a1 + a);	
	}
	
	public void output(){
		DecimalFormat df = new DecimalFormat ("#.00");
		System.out.println("\n");
		System.out.println("SYSTEM COST");
		System.out.println("===========");
		System.out.println("Purchase\t = $" + df.format(a));
		System.out.println("Tax\t\t = $" + df.format(a1));
		System.out.println("-----------");
		System.out.println("Total\t\t = $" + df.format(price));
		System.out.println("\t");
		System.out.println("You got a lot of shit to pay!");
		System.out.println("\t");
	}
}	
