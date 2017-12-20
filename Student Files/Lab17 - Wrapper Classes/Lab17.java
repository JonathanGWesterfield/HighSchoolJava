import java.util.Scanner;

public class Lab17
{
	private String firstNum;
	private String secondNum;
	private String sum;

 	public static void main(String[ ] args) 
	{
		Lab17 lab = new Lab17( );
		lab.input();	// Read two binary numbers
		lab.process();	// Add the two numbers together
		lab.output( );	// Display output
	}
	
	public void input() {
		Scanner kybd = new Scanner(System.in);
		System.out.print("Enter the first binary number: ");
		firstNum = kybd.next();
		System.out.print("Enter the second binary number: ");
		secondNum = kybd.next();
	}
	
	
	/* Write the process method here */
	public void process()
	{
		int a = Integer.parseInt(firstNum,2);
		int b = Integer.parseInt(secondNum,2);
		sum = Integer.toBinaryString(a + b);
	}
	
	
	public void output() {
		System.out.println(firstNum + " + " + secondNum + " = " + sum);
	}


}
