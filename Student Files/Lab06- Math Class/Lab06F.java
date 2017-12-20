//Jonathan Westerfield

import java.text.DecimalFormat;

public class Lab06F
{
	private double a;
	private double b;
	private double c;
	public static void main(String[] args) 
	{
    	Lab06F lab = new Lab06F();
    	lab.process();
    	lab.output();
    }
    
    public void process()
    {
    	a = (int)(Math.random() * 6) + 1;
    	b = (int)Math.random() * 6 + 1;
    	c = a + b;
    }
    
    public void output()
    {
    	DecimalFormat df = new DecimalFormat("#.#");
    	System.out.println("You rolled " + (int)a + " and " + (int)b);
    	System.out.println("Total This Roll: " + (int)c);
    }
}
	