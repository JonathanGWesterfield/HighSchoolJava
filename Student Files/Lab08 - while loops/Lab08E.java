//Jonathan Westerfield

import java.util.Scanner;

public class Lab08E
{
	private String name;
	private int num;
	
	public static void main(String[] args) 
	{
    	Lab08E lab = new Lab08E();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("What is your name? ");
    	name = reader.next();
    	System.out.print("How many times do you want your name to be displayed? ");
    	num = reader.nextInt();
    }
    
    public void output()
    {
    	System.out.print(name + " displayed " + num + " times: \n");
    	int lcv = 0;
    	while(lcv < num)
    	{
    		System.out.println(name);
    		lcv++;
			name = " " + name;
    		
    	}
    }
}