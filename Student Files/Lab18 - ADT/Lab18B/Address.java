//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class Address
{
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phonenumber;
	
	Address(){}
	
	Address(String firstname, String lastname, String address, String city, String state, String zipcode, String phonenumber)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phonenumber = phonenumber;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	public String getAddresss()
	{
		return address;
	}
	
	public void setAddresss(String address)
	{
		this.address = address; 
	}
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getZipcode()
	{
		return zipcode;
	}
	
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}
	public String getPhonenumber()
	{
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	@Override
	public String toString()
	{
		return "["+ firstname + ", "+ lastname + ", "+ address + ", " 
			+ city + ", " +state + ", " + phonenumber + "]";
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Address)
		{
			Address a  = (Address)obj;
			return firstname.equals(a.firstname)&&lastname.equals(a.lastname)&&address.equals(a.address);
		}
		return false;
	}
}