//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class LittleBlackBook
{
  
  private Address[] address = new Address[50];
  int count = 0;
  public static void main (String[] args) 
  {
      LittleBlackBook book = new LittleBlackBook();
      book.input();
      book.output();
    }
    
    public void input()
    {
      try
      {
        Scanner reader = new Scanner(new File("lab18b.dat")).useDelimiter(",|\r\n");
        while(reader.hasNext())
        {
          
          String firstname = reader.next();
          String lastname = reader.next();
          String addresses = reader.next();
          String city = reader.next();
          String state = reader.next();
          String zipcode = reader.next();
          String phonenumber = reader.next();
          address[count++] = new Address(firstname, lastname, addresses, city, state, zipcode, phonenumber);
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
      for(int i = 0; i<count; i++)
      {
        System.out.println(address[i]);
      } 
    }
}