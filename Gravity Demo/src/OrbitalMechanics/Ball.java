package OrbitalMechanics;

public class Ball extends CelestialBody
{
	private int id;
	private static int idNum = 0;
	public Ball(String Name) 
	{
		super(Name);
		id = idNum++;
	}
	
}
