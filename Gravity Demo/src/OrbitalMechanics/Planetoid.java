package OrbitalMechanics;

public class Planetoid extends OrbitalObject
{

	private int mass;
	
	public Planetoid(String planetName) 
	{
		super(planetName);
	}

	public void setMass(int newMass) { 	mass = newMass; }
	public int getMass() { return mass; }
}
