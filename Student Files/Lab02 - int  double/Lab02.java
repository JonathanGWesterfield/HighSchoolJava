//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab02
{
	private int dollars;
	private double euros;
	private static final double rate = .7522;
	
	public static void main(String[]args)
	{
		Lab02 lab = new Lab02();
		lab.input();
		lab.process();
		lab.output();
	}

	public void input(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter an amount in dollars: ");
		dollars = reader.nextInt();
	}
	public void process(){
		euros = dollars * rate;

	}

	public void output(){
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(dollars + " Dollars = " + df.format(euros) + " Euros ");
	}
}