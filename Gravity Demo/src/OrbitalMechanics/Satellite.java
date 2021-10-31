package OrbitalMechanics;

public class Satellite extends OrbitalObject
{
	private int id;
	private static int idNum = 0;
	private final int mass = 1;
	
	public Satellite(String Name) 
	{
		super(Name);
		id = idNum++;
	}
	
}
