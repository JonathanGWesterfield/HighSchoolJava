//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Check
{
	int number;
	String date;
	String payee;
	double amount;
	
	Check(){}
	
	Check(int number, String date, String payee, double amount)
	{
		this.number = number;
		this.date = date;
		this.payee = payee;
		this.amount = amount;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public String date()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getPayee()
	{
		return payee;
	}
	
	public void setPayee(String payee)
	{
		this.payee = payee;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	@Override
	public String toString()
	{
		return "[" + number + "," + date + "," + payee + "," + amount + "]";
	}
	
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Check)
		{
			Check c = (Check)obj;
			return number==c.number;
		}
		return false;
	}
}