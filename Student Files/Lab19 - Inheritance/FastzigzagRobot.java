//Jonathan Westerfield

import java.util.Scanner;
import java.io.*;

public class FastzigzagRobot extends ZigzagRobot
{
	protected static final String[] moves = {"One" , "Two" , "Three"};
	public static void main (String[] args) {
		new FastzigzagRobot("FastZigZagRobot");
    }
    public FastzigzagRobot(String title){
    	super(title);
    }
    @Override
    public boolean act(String command){
    	if(super.act(command))
    		return true;
    	if(command.equals("ZIG ZAG RIGHT THREE"))
    	{
    		int count = zigrightthree();
    		if(count == 0)
    			setResponse("Unable To Zig Zag Right Three, Sir!");
    		else
    			setResponse("Move Zig Zag Right " + moves[count - 1] + ", Sir!");
    		return true;
    	}
    	else if(command.equals("ZIG ZAG LEFT THREE"))
    	{
    		int count1 = zigleftthree();
    		if(count1 == 0)
    			setResponse("Unable to Zig Zag Left Three, Sir!");
    		else
    			setResponse("Move Zig Zag Left " + moves[count1 - 1] + ", Sir!");
    		return true;
    	}
    	return false;
    }
    public int zigrightthree()
    {
		int count = 0;
		for(int x =0; x<3; x++)
		{
			if(super.zigright())
				count++;
		}
		return count;
	}
 
    public int zigleftthree()
    {
		int count1 = 0;
		for(int x =0; x<3; x++)
		{
			if(super.zigleft())
				count1++;
		}
		return count1;
	}

}