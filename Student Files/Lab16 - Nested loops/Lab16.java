import java.util.Scanner;

public class Lab16
{
	private int size;
	
	public static void main(String[ ] args) 
	{
		Lab16 lab = new Lab16( );
		lab.input();	// Read rom the keyboard
		lab.output( );	// Display output
	}
	
	public void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the size of the pyramid: ");
		size = reader.nextInt();
	}

	public void spaces(int n)
	{
		for(int i = 0; i < n; i++)
			System.out.print(" ");
			
	}
	


	public void output()
	{
		for(int y=1; y<= size ; y++)
		{
			spaces(size-y);
			for(int x = 1; x <= y ; x++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
}
