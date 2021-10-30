package OrbitalMechanics;

public class Satellite extends OrbitalObject
{
	private int id;
	private static int idNum = 0;
	public Satellite(String Name) 
	{
		super(Name);
		id = idNum++;
	}
	
}
