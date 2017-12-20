//Jonathan Westerfield

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11C
{
	char code;
	private double units;
	
	public static void main (String[] args) 
	{
    	for(int i=0; i<=3; i++)
    	{
    		Lab11C lab = new Lab11C();
    		lab.input();
    		lab.output();
    	}
    		
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("<P - Pounds>\n<F - Feet>\n<M - Miles>\nMake a Selection: ");
    	code = reader.next().charAt(0);
    	System.out.print("Enter a real number: ");
    	units = reader.nextDouble();
    }
    
    public void output()
    {
    	switch(code)
    	{
    		case 'P':
    			System.out.println(units +" pounds = "+ (units*4.9) +" Newtons");
    			break;
    		case 'F':
    			System.out.println(units +" Feet = "+ (units*.30488)+ " Newtons");
    			break;
    		case 'M':
    			System.out.println(units +" Miles = "+ (units*1.61)+ " Kilometers");
    			break;
    	}
    	
    }
}