package OrbitalMechanics;
/**
 * 
 * @author matth
 *
 */
public abstract class OrbitalObject 
{
	//Instance Variables
	private String name;
	private double xPos, yPos;
	private double xVel, yVel;
	int mass;
	
	//Constructor
	public OrbitalObject(String Name)
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
	public int getMass() { return mass; }

	//Setter Methods
	public void setxPos(double xPos) { this.xPos = xPos; }
	public void setyPos(double yPos) { this.yPos = yPos; }
	public void setPosition(double xPos, double yPos)
	{
		this.setxPos(xPos);
		this.setyPos(yPos);
	}
	public void setxVel(double xVel) { this.xVel = xVel; }
	public void setyVel(double yVel) { this.yVel = yVel; }
	public void setVelocity(double xVel, double yVel)
	{
		this.setxVel(xVel);
		this.setyVel(yVel);
	}
	public void setName(String newName) { this.name = newName; }
	public void setMass(int newMass) { this.mass = newMass; }
	
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
//Velocity Methods
	
	public void addVelocity(double addedXVel, double addedYVel)
	{
		xVel += addedXVel;
		yVel += addedYVel;
	}
	
//============================================================================================================================================
//Function methods
	
	//Prints info about object position to the console
	public void print()
	{
		System.out.println(Clock.getSecond() + ". " + name + ": Position (x,y): " + xPos + ", " + yPos);
		System.out.println(Clock.getSecond() + ". " + name + ": Velocity (x,y): " + xVel + ", " + yVel);
	}
}
