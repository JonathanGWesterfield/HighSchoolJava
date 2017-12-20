//Jonathan Westerfield

import java.util.Scanner;

public class Lab03B
{
	private String firstname;
	private String lastname;
	private String fullname;
	private int len;
	
	public static void main(String[]args)
	{	
		Lab03B lab = new Lab03B();
		lab.input();
		lab.process();
		lab.output();
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		firstname = reader.next();
		System.out.print("Enter your last name: ");
		lastname = reader.next();
	}
	
	public void process()
	{
		fullname = (firstname + " " + lastname);
		len = firstname.length() +lastname.length();
	}
	
	public void output()
	{
		System.out.println("My name is " + fullname + ".");
		System.out.println("My name contains " + len + " Characters");
	}
}