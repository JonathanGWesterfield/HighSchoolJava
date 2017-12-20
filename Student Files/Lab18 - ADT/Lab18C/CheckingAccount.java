//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class CheckingAccount
{
  
  private Check[] check = new Check[50];
  int count = 0;
  double startingbalance;
  double endingbalance;
  
  public static void main (String[] args) 
  {
      CheckingAccount chk = new CheckingAccount();
      chk.input();
      chk.process();
      chk.output();
    }
    
    public void input()
    {
    try
    {
      Scanner reader = new Scanner(new File("lab18c.dat"));
      startingbalance = reader.nextDouble();
      while(reader.hasNext())
      {
        int number = reader.nextInt();
        String date = reader.next();
        reader.nextLine();
        String payee = reader.nextLine();
		double amount = reader.nextDouble();
        check[count++] = new Check(number,date,payee,amount);
      }
    }
    catch(IOException e)
    {
      System.out.println(e);
      System.exit(0);
    }
  }
    
    public void process()
    {
      endingbalance = startingbalance;
      for(int i = 0; i<count; i++)
      {
        endingbalance -= check[i].getAmount();
      }
    }   
  
  public void output()
  {
    System.out.println("Beginning Balance: "+startingbalance +"\n");
    System.out.println("Checks Processed: ");
    for(int i=0; i<count; i++)
    {
      System.out.print(check[i]); 
      System.out.println();
    }
    System.out.println();
    System.out.println("Ending Balance: " + endingbalance);
  }
}    
          