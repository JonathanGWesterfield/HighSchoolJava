//Jonathan Westerfield

import java.util.Scanner;
import Robots.Robot;

public class SmartRobot extends Robot
{
	public static void main(String args[])
	{
		new SmartRobot("Smart Robot");
	}
	
	public SmartRobot(String title)
	{
		super(title);
	}
	
	public boolean act(String command)
	{
		if(command.equalsIgnoreCase("TURN RIGHT"))
		{
			turnRight();
			setResponse("Fine.");
			return true;
		}
		
		else if(command.equalsIgnoreCase("TURN AROUND"))
		{
			turnAround();
			setResponse("Soooo much effort.");
			return true;
		}
		return false;
	}
	
	public void turnRight()
	{
		super.turnLeft();
		super.turnLeft();
		super.turnLeft();
	}
	
	public void turnAround()
	{
		super.turnLeft();
		super.turnLeft();
	}
	
}
	