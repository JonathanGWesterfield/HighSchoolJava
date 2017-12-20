import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11
{
	private double a;
	private double b;
	private char symbol;
	private double solution;
	
	public static void main(String[] args) 
	{
		for (int i = 0; i < 3; i++)
		{
			Lab11 lab = new Lab11( );
			lab.input();	
			lab.process();
			lab.output( );	
	}
	
	public void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter an expression in the form [a + b]: ");
		a= reader.nextDouble();
		symbol = reader.next().charAt(0);
		b= reader.nextDouble();
	}
		
	public void output() {
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println(df.format(a) + "  " + symbol + "  " + df.format(b) + "  =  " + df.format(solution));
	}

	
}
