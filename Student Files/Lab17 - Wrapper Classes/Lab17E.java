//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Lab17E
{
    char[] str = new char[80];
    
    public static void main(String[] args)
    {
        Lab17E lab = new Lab17E();
        lab.input();
        lab.output();
    }

    public void input()
    {
        try
        {
            Scanner reader = new Scanner(new File("lab17e.dat"));
            str = reader.nextLine().toCharArray();
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(0);
        }
    }

    public char lowercase(char lowletter)
    {
        char realletter = (char) (lowletter + 1);
        if(realletter>122)
            return 'a';
        else
            return realletter;
        
    }
    
    public char uppercase(char upletter)
    {
        char realletter = (char) (upletter -1);
        if(realletter>90)
            return 'A';
        else
            return realletter;
    }
    
    public void output()
    {
        for(int i = 0; i<str.length; i++)
        {
            if(Character.isLowerCase(str[i]))
            {
                System.out.print(Character.toUpperCase(lowercase(str[i])));
            }
            
            else if(Character.isUpperCase(str[i]))
            {
                System.out.print(uppercase(str[i]));
            }
            
            else
                System.out.print(str[i]);
        }
        System.out.println();
    }
}