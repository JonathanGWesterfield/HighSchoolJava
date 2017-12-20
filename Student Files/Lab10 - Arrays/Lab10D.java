//Jonathan Westerfield

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class Lab10D
{
    private String[] names = new String[500];
    private String[] age = new String[500];
    int count = 0;

    public Lab10D() {
    }
    
     
    public static void main(String[] args)
    {
        Lab10D lab = new Lab10D();
        lab.input();
        lab.output();
        
    }
    
    public void input()
    {
        try
        {
            Scanner reader = new Scanner(new File("lab10d.dat")).useDelimiter("/|\r\n");
            while(reader.hasNext())
            {
                names[count] = reader.next(); 
                age[count++] = reader.next(); 
            }
                     
        }
        
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(0);
        }
    }
    
    public void output()
    {
        for(int i = 0; i< count; i++)
            System.out.println(names[i] + " is " + age[i] + " years old.");
    }
    
}
