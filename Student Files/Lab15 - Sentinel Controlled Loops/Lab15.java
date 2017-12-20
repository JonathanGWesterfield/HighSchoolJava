import java.util.*;

public class Lab15
{
	private char[] list = new char[20];
	private int count;
	
	public static void main(String[ ] args) 
	{
		Lab15 lab = new Lab15( );
		lab.input();	// Enter data from the kybd
		lab.process();	// Sort the array
		lab.output( );	// Display output
	}
	
	public void input()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = reader.next().charAt(0);
		while(ch!='.')
		{
			list[count++] = ch;
			System.out.print("Enter a character: ");
			ch = reader.next().charAt(0);
		}
	}
	
	public void output() {
		for (int i = 0; i < count; i++)
			System.out.print(list[i]);
		System.out.println();
	}
	
	public void process() {
		Arrays.sort(list, 0, count);
	}
}
