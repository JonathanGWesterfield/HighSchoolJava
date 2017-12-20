//Jonathan Westerfield

public class ZigzagRobot extends FastRobot
{
	public static void main(String[] args) 
	{
    	new ZigzagRobot ("ZigZag Robot");
    }
    
    public ZigzagRobot (String title)
    {
    	super(title);
    }
    
    @Override
    public boolean act(String command)
    {
    	if(super.act(command))
    	{
    		return true;
    	}
    	
    	if(command.equalsIgnoreCase("ZIGZAG LEFT"))
    	{
    		if(zigleft())
    		{
    			setResponse("This is getting confusing");
    		}
    		else
    		{
    			setResponse("It can't be done!");
    		}
    		return true;
    	}
    	
    	else if(command.equalsIgnoreCase("ZIGZAG RIGHT"))
    	{
    		if(zigright())
    		{
    			setResponse("ALRIGHTY THEN!");
    		}
    		else
    		{
    			setResponse("I'm not feeling it");
    		}
    		return true;
    	}
    return false;
    }
    
      public boolean zigright(){
    	if(super.moveForward())
    	{
    		super.turnRight();
    		if(super.moveForward())
    		{
    			super.turnLeft();
    			return true;
    		}
    		else
    		{
    			super.turnLeft();
    			super.retreat();
    			return false;
    		}
    	}
    	return false;
    }
	public boolean zigleft(){
    	if(super.moveForward())
    	{
    		super.turnLeft();
    		if(super.moveForward())
    		{
    			super.turnRight();
    			return true;
    		}
    		else
    		{
    			super.turnRight();
    			super.retreat();
    			return false;
    		}
    	}
    	return false;
    }
}