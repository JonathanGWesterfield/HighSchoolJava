//Jonathan Westerfield

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class Lab10E
{
    private double[] list = new double[900];
    private int count = 0;
    private double searchitem;
    private double replacevalue;
    
    public static void main(String[] args)
    {
        Lab10E lab = new Lab10E();
        lab.fileinput();
        lab.kybdinput();
        lab.output();
    }
    
    public void fileinput()
    {   
       
        try
        {
         Scanner reader = new Scanner(new File("lab10e.dat"));
         
         while(reader.hasNextDouble())
             list[count++] = reader.nextDouble();
        }
     
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(0);
        }
     
    }
    
    public void kybdinput()
    {
        Scanner kybd = new Scanner(System.in);
        System.out.print("Enter a value to search for: ");
        searchitem = kybd.nextDouble();
        System.out.print("Enter a replacement value: ");
        replacevalue = kybd.nextDouble();
    }
    
    public void output()
    {
        Arrays.sort(list,0,count);
        int a = Arrays.binarySearch(list,0,count,searchitem);
        if(a<0)
        {
            System.out.println(searchitem + " not found!");
            for(int i = 0; i< count; i++)
                System.out.print(list[i] + " ");
            
        }
        else
        {
            System.out.println("The Modified List:");
            for(int g = 0 ; g < count; g++)
            {
                System.out.println(list[g] + " ");
            }
        }
    }
    
}