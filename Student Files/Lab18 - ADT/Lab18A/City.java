//Jonathan Westerfield

public class City
{
	private String name;
	private String location;
	public City(){}
	public City(String name, String location)
	{
		this.name = name;
		this.location = location;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getlocation()
	{
		return location;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setlocation(String Location)
	{
		this.location = location;
	}
	@Override
		public String toString()
		{
			return name + "," +location;
		}
	public boolean equal(Object obj)
	{
		if(obj instanceof City)
		{
			City c  = (City)obj;
			return name.equals(c.name)&& location.equals(c.location);
		}
		return false;
	}
	
}