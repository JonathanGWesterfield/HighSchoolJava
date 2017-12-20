//Jonathan Westerfield

import java.util.Scanner;

public class Lab03E
{
	private String firstname;
	private String lastname;
	private int age;
	private String mathclass;
	
	public static void main(String[]args)
	{
		Lab03E lab = new Lab03E();
		lab.input();
		lab.output();
	}
		
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter Student's First Name: ");
		firstname = reader.nextLine();
		System.out.print("Enter Student's Last Name: ");
		lastname = reader.nextLine();
		System.out.print("Enter Student's Age: ");
		age = reader.nextInt();
		reader.nextLine();
		System.out.print("Enter Student's Math Class: ");
		mathclass = reader.nextLine();
	}
	
	public void output()
	{
		System.out.println("\nMy Name is " + firstname + " " + lastname + ".\nI am " + age + " years old.\nI am enrolled in " + mathclass + ".");
	}
}
	
	