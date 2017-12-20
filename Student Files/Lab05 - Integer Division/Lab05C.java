//Jonathan Westerfield

import java.util.Scanner;

public class Lab05C
{
	private int time;
	private int hours;
	private int minutes;
	private int seconds;
	
	public static void main(String[] args) 
	{
		Lab05C lab = new Lab05C();
		lab.input();
		lab.process();
		lab.output();
    }
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of seconds: ");
		time = reader.nextInt();
	}
	
	public void process()
	{
		hours = time / 3600;
		minutes = (time % 3600) / 60;
		seconds = time % 60;
		
	}
	
	public void output()
	{
		System.out.println(time + " seconds = " + hours + " hours " + minutes + " minutes and " + seconds + " seconds.");
	}
}