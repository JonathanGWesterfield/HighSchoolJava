import java.util.Scanner;

public class Lab14_2
{
	private String animal1;
	private String animal2;
	
	public static void main(String[ ] args) {
		for (int i = 0; i < 3; i++)
		{
			Lab14_2 lab = new Lab14_2();			
			lab.input();	// Read data from the keyboard
			lab.output( );	// Display output
		}
	}
	
	public void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the name of the first animal: ");
		animal1 = reader.nextLine();
		System.out.print("Enter the name of the second animal: ");
		animal2 = reader.nextLine();
	}

	public void output()
	{
		if(animal1.compareToIgnoreCase(animal2)<0)
		{
			System.out.println("Noah has a(n) " + animal1 + " and a(n) " + 
				animal2 + ".");
		}
		
		else if(animal1.compareToIgnoreCase(animal2)<0)
		{
			System.out.println("Noah has a(n) " + animal2 + " and a(n) "+
				animal1 + ".");
		}
		
		else
		{
			System.out.println("Noah has a pair of " + animal1 + "'s.");
		}
		
	}
	
}
