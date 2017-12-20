//Jonathan Westerfield


import Robots.Robot;

public class SquareRobot extends FastzigzagRobot
{
	public static void main (String[] args) {
		new SquareRobot("SquareRobot");
    }
    public SquareRobot(String title){
    	super(title);
    }
    @Override
    public boolean act(String command){
    	if(super.act(command))
    		return true;
    	if(command.equals("LEFT SQUARE"))
    	{
    		if(leftSquare())
    			setResponse("I do what I want!");
    		else
    			setResponse("Just...no");
    		return true;
    	}
    	else if(command.equals("RIGHT SQUARE"))
    	{
    		if(rightSquare())
    			setResponse("I do what I want!");
    		else
    			setResponse("Nah");
    		return true;
    	}
    	return false;
    }
    public boolean leftSquare(){
		int count = super.moveForwardthree();
		if(count == 3)
		{
			super.turnLeft();
			count = super.moveForwardthree();
			if(count == 3)
			{
				super.turnLeft();
				super.moveForwardthree();
				super.turnLeft();
				super.moveForwardthree();
				super.turnLeft();
				return true;
			}
			else
			{
				for(int i=0; i<count;i++)
				{
					super.retreat();
				}
				super.turnLeft();
				super.moveForwardthree();
				super.turnAround();
			}
		}
		else
		{
			for(int i=0; i< count;i++)
			{
				super.retreat();
			}
		}
		return false;
    }
    public boolean rightSquare()
    	{
  			int count = super.moveForwardthree();
			if(count == 3)
			{
				super.turnLeft();
				count = super.moveForwardthree();
				if(count == 3)
				{	
					super.turnLeft();
					super.moveForwardthree();
					super.turnLeft();
					super.moveForwardthree();
					super.turnLeft();
					return true;
				}
				else
				{
					for(int i=0; i<count;i++)
					{
						super.retreat();
					}
					super.turnRight();
					super.moveForwardthree();
					super.turnAround();
				}
			}
			else
			{
				for(int i=0; i< count;i++)
				{
					super.retreat();
				}
			}
			return false;
    }
}