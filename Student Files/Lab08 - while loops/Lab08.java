import java.util.Scanner;

public class Lab08
{
	private int start;
	private int end;
	
	public static void main(String[ ] args) {
		Lab08 lab = new Lab08( );
		lab.input();	
		lab.output( );	
	}
	
	public void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the starting value: ");
		start = reader.nextInt();
		System.out.print("Enter the ending value: ");
		end = reader.nextInt();
	}
	
	public void output()
	{
		int ascii = start;
			while(ascii<=end)
			{
				System.out.println(ascii + "=" + (char)ascii);
				ascii++;
			}
	}
	
	
	
	
}
