//Jonathan Westerfield

public class CluelessRobot extends SquareRobot
{
	public static void main(String[] args){
		new CluelessRobot("CluelessRobot");
	}
	public CluelessRobot(String title){
		super(title);
	}
	//retreat
	public boolean moveForward(){
		return super.retreat();
	}
	//turn right
	public void turnleft(){
		super.turnRight();
	}
	//turn left
	public void turnright(){
		super.turnLeft();
	}
	//back up three
	public int moveForwardthree(){
		int count = 0;
		for(int x = 0;x < 3;x++)
		{
			if(super.retreat())
				count++;
		}
	return count;
	}
	//move forward
	public boolean retreat(){
		return super.moveForward();
	}
	//zig zag left
	public boolean ZigRight(){
		return super.zigleft();
	}
	//zig zag right
	public boolean ZigLeft(){
		return super.zigright();
	}
	//zig zag right three
	public int ZigLeftThree(){
		return super.zigrightthree();
	}
	//zig zag left three
	public int zigrightthree(){
		return super.zigleftthree();
		
	}
	//right square
	public boolean leftSquare(){
		return super.rightSquare();
	}
	//left square
	public boolean rightSquare(){
		return super.leftSquare();
	}
}