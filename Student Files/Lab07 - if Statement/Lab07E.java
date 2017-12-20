//Jonathan Westerfield	

import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Lab07E
{
	private String lastname;
	private String firstname;
	private String SSN;
	private int status;
	private int numdependents;
	private double grossincome;
	private double taxwithheld;
	private double taxableincome;
	private double totaltax;
	private double amountowed;
	private double deductions;
	private final double taxrate = .15;
	private final double singlededuction = 4750;
	private final double marrieddeduction = 9500;
	private final double individualdeduction = 3050;

	public static void main(String[] args) 
	{
		Lab07E lab = new Lab07E();
		lab.input();
		lab.process();
		lab.output();
    }
    
    public void input()
    {
    	
    	try
    	{
    		Scanner reader = new Scanner(new File("Ackerman.dat"));
    		lastname = reader.next();
    		firstname = reader.next();
    		SSN = reader.next();
    		status = reader.nextInt();
    		numdependents = reader.nextInt();
    		grossincome = reader.nextDouble();
    		taxwithheld = reader.nextDouble();
    	}
    	
    	catch(IOException e)
    	{
    		System.out.println(e);
    		System.exit(0);
    	}
    	
    }
    
    public void process()
    {
    	if(status == 0)
    		deductions = singlededuction + numdependents * individualdeduction;
    	else
    		deductions = marrieddeduction + numdependents * individualdeduction;
    	taxableincome = grossincome - deductions;
    	totaltax = taxableincome * taxrate;
    	amountowed = Math.abs(totaltax - taxwithheld);
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat(",###.00");
    	System.out.println("Income Tax Statement for " + firstname + " " + lastname);
    	System.out.println("SSN: " + SSN);
    	if(status == 0)
    		System.out.println("Filing Status: Single with " + numdependents + " dependents.");
    	else if(status == 1)
    		System.out.println("Filing Status: Married with " + numdependents + " dependents.");
    	System.out.println("Adjusted Gross Income:		$" + df.format(grossincome));
    	System.out.println("Income Tax for 2006: 		$" + df.format(totaltax));
    	System.out.println("Tax Refund: 			$" + df.format(amountowed));
    	
    }
}