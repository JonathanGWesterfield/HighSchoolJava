//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab17A
{
	private String[] binary = new String[50];
	private int count = 0;

 	public static void main(String[ ] args) 
	{
		Lab17A lab = new Lab17A( );
		lab.input();	
		
		lab.output( );
	}
	
	public void input()
	{
		try
		{
			Scanner reader = new Scanner(new File("lab17a.dat"));
			while(reader.hasNext())
			{
				binary[count++] = reader.next();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(0);
		}
		
		
	}
	
	public static String ipaddress(String str)
	{
		String strA = str.substring(0,8);
		String strB = str.substring(8,16);
		String strC = str.substring(16,24);
		String strD = str.substring(24,32);
		int ipA = Integer.parseInt(strA,2);
		int ipB = Integer.parseInt(strB,2);
		int ipC = Integer.parseInt(strC,2);
		int ipD = Integer.parseInt(strD,2);
		String magic = ipA + "." +ipB + "." + ipC + "." + ipD;
		return magic;
		
		
		
			
			
	}
	public void output()
	{
		for(int i =0; i<count; i++)
		{
			System.out.println(binary[i] + " = " + ipaddress(binary[i]));
		}
	}
}