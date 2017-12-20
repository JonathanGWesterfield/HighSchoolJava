//Jonathan Westerfield



public class FastRobot extends SmartRobot
{
	protected static final String[] moves = {"one","two","three","four","five","six","seven","eight","nine","ten"};
	
	public static void main(String[]args)
	{
		new FastRobot("Fast Robot");
	}
	
	public FastRobot(String title)
	{
		super(title);
	}
	
	@Override
	public boolean act(String command)
	{
		if(super.act(command))
			return true;
		if(command.equalsIgnoreCase("retreat"))
		{
			if(retreat())
			{
				setResponse("Running away now.");
			}
			else
			{
				setResponse("I can't do it");
			}
			return true;
		}
		else if(command.equalsIgnoreCase("MOVE FORWARD THREE"))
		{
			int count = moveForwardthree();
			if(count==0)
			{
				setResponse("It's literally impossible.");
			}
			else
			{
				setResponse("Aww yiss!");
			}
			return true;
		}
		
		return false;
	}
	
	public boolean retreat()
	{
		super.turnAround();
		boolean move = super.moveForward();
		super.turnAround();
		return move;
	}
	
	public int moveForwardthree()
	{
		int count = 0;
		for(int x =0; x<3; x++)
		{
			if(super.moveForward())
				count++;
		}
		return count;
	}
}