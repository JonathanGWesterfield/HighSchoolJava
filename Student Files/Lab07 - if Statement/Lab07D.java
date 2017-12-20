//Jonathan Westerfield

import java.util.Scanner;

public class Lab07D
{
	public double weight;
	public double weightonplanet;
	public int choice;
	public final double Mercury = .37;
	public final double Venus = .88;
	public final double Mars = .38;
	public final double Jupiter = 2.64;
	public final double Saturn = 1.15;
	public final double Uranus = 1.15;
	public final double Neptune = 1.12;
	public final double Pluto = .04;
	
	public static void main(String[] args) 
	{
    	Lab07D lab = new Lab07D();
    	lab.input();
    	lab.process();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("How much to you weigh? ");
    	weight = reader.nextDouble();
    	System.out.print("\n1). Mercury\n2). Venus\n3). Mars\n4). Jupiter\n5). Saturn\n6). Uranus\n7). Neptune\n8). Pluto\n\nSelect a Planet: ");
    	choice = reader.nextInt();
    }
    
    public void process()
    {
    }
    
    public void output()
    {
    	if(choice == 1)
    		System.out.println("\nOn Mercury, you would weigh " + weight*Mercury + " pounds.");
    	else if(choice == 2)
    		System.out.println("\nOn Venus, you would weigh " + weight*Venus + " pounds.");
    	else if(choice == 3)
    		System.out.println("\nOn Mars, you would weigh " + weight*Mars + " pounds.");
    	else if(choice == 4)
    		System.out.println("\nOn Jupiter, you would weigh " + weight*Jupiter + " pounds.");
    	else if(choice == 5)
    		System.out.println("\nOn Saturn, you would weigh " + weight*Saturn + " pounds.");
    	else if(choice == 6)
    		System.out.println("\nOn Uranus, you would weigh " + weight*Uranus + " pounds.");
    	else if(choice == 7)
    		System.out.println("\nOn Neptune, you would weigh " + weight*Neptune + " pounds.");
    	else if(choice == 8)
    		System.out.println("\nOn Pluto, you would weigh " + weight*Pluto + " pounds.");
    	System.out.println("\n");
    }
}