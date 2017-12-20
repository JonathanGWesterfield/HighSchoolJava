//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab15B
{
    String[] list = new String[500];
    int count = 0;
    
    public static void main(String [] args)
    {
        Lab15B lab = new Lab15B();
        lab.input();
        lab.process();
        lab.output();
    }
    
    public void input()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String str = reader.next();
        while(!str.equalsIgnoreCase("done"))
        {
            list[count++] = str;
            
            System.out.print("Enter a name: ");
            str = reader.next();
            
        }
    }
    
    public void process()
    {
        Arrays.sort(list, 0, count);
    }
    
    public void output()
    {
        for(int i = 0; i< count; i++)
        {
             System.out.println(list[i]);       
        }
        System.out.println(count +" names were entered.");
    }
}

