//Jonathan Westerfield

import java.util.Scanner;

public class Lab07B
{
	private String name;
	private int grade;
	
	public static void main(String[] args) 
	{
    	Lab07B lab = new Lab07B();
    	lab.input();
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter a name: ");
    	name = reader.next();
    	System.out.print("Enter a grade: ");
    	grade = reader.nextInt();
    }
    
    public void output()
    {
    	if(grade>=90)
    		System.out.println(name + ", You Made A Grade of " + grade + ". Congratulations!");
    	else if(grade>=70&&grade<89)
    		System.out.println(name + ", You Made A Grade of " + grade + ".");
    	else
    		System.out.println(name + ", You Made A Grade of " + grade + ". You poor boy, Study harder!");
    	
    }
}