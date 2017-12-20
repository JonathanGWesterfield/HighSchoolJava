import java.util.Scanner;

public class Lab05
{
	private static final int DAY = 24;
	private static final int WEEK = DAY * 7;
	private int numberOfDays;
	private int numberOfWeeks;
	private int hours;

	

	public static void main(String[] args) 
	{
		Lab05 lab = new Lab05();
		lab.input();	// Enter data from the kybd
		lab.process( );	// Calculate Vol and SA
		lab.output( );	// Display output
	}
      
	public void input() 
	{
	 	Scanner reader = new Scanner(System.in);
	    System.out.print("Enter the number of hours: ");
	    hours = reader.nextInt();
	}
	
	public void process()
	{
		numberOfWeeks = hours / WEEK;
		numberOfDays = hours % WEEK / DAY;
		hours = hours % DAY;
	}


	
	public void output() 
	{
		System.out.println( "There are " + numberOfWeeks + " week(s) and " +  numberOfDays + " day(s) and " + hours + " hours.");
	}
}
