package OrbitalMechanics;
/**
 * 
 * @author matth
 *
 */
public abstract class CelestialBody 
{
	//Instance Variables
	private String name;
	private double xPos, yPos;
	private double xVel, yVel;
	
	//Constructor
	public CelestialBody(String Name)
	{
		name = Name;
	}
	
//============================================================================================================================================
//Getters and Setters
	
	//Accessor Methods
	public double getxPos() { return xPos; }
	public double getyPos() { return yPos; }
	public double getxVel() { return xVel; }
	public double getyVel() { return yVel; }
	public String getName() { return name; }

	//Mutator Methods
	public void setxPos(double xPos) { this.xPos = xPos; }
	public void setyPos(double yPos) { this.yPos = yPos; }
	public void setxVel(double xVel) { this.xVel = xVel; }
	public void setyVel(double yVel) { this.yVel = yVel; }
	public void setName(String newName) { this.name = newName; }

//============================================================================================================================================
//Position Methods
	
	//Updates Satellite position
	public void updatePosition()
	{
		updateXPos();
		updateYPos();
	}
	
	//Updates only the xPosition
	public void updateXPos(){ xPos = xPos + xVel; }
	
	//Updates only the yPosition
	public void updateYPos(){ yPos = yPos + yVel; }
	
	
//============================================================================================================================================
//Function methods
	
	//Prints info about object position to the console
	public void print()
	{
		System.out.println("Position (x,y): " + xPos + ", " + yPos);
		System.out.println("Velocity (x,y): " + xVel + ", " + yVel);
	}
}
