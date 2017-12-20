//Jonathan Westerfield

import java.util.Scanner;

public class Lab03D
{
	private int age;
	private String name;
	private int birthday;
	
	public static void main(String[]args)
	{
		Lab03D lab = new Lab03D();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = reader.nextLine();
		System.out.print("Enter your age: ");
		age = reader.nextInt();
	}
	
	public void process()
	{
		birthday = 2014 - age;
	}
	
	public void output()
	{
		System.out.println("Hello, " + name + ". Yor were born in " + birthday + ".");
	}
}


