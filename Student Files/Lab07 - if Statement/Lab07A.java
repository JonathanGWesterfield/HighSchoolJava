//Jonathan Westerfield

import java.util.Scanner;

public class Lab07A
{
	private int age;
	
	public static void main(String[] args) 
	{
    	Lab07A lab = new Lab07A();
    	lab.input();
    
    	lab.output();
    }
    
    public void input()
    {
    	Scanner reader = new Scanner(System.in);
    	System.out.print("Enter your age: ");
    	age = reader.nextInt();
    	
    }
    
    public void output()
    {  
    	if(age>=17)
    		System.out.println("At age " + age + ", a person is old enough to drive.");
    	else
    		System.out.println("At age " + age + ", a person is old not enough to drive.");
    	if(age>=18)
    		System.out.println("At age " + age + ", a person is old enough to vote.");
    	else
    		System.out.println("At age " + age + ", a person is not old enough to drive.");
    	if(age>=21)
    		System.out.println("At age " + age + ", a person is old enough to drink alcohol legally.");
    	else
    		System.out.println("At age " + age + ", a person is not old enough to drink alcohol legally.");
    }
}