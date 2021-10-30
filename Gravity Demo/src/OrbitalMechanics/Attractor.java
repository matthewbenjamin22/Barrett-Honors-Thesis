package OrbitalMechanics;

public class Attractor extends CelestialBody
{

	private int mass;
	
	public Attractor(String planetName) 
	{
		super(planetName);
	}

	public void setMass(int newMass) { 	mass = newMass; }
	public int getMass() { return mass; }
}
