package OrbitalMechanics;
/**
 * @author matth
 *
 */

import java.util.ArrayList;

public class CoordinatePlane 
{	
	//Instance Variables
	private ArrayList<CelestialBody> ballList;
	private ArrayList<Attractor> celestialBodyList;
	
	//Constructor
	public CoordinatePlane()
	{
		ballList = new ArrayList<CelestialBody>();
		celestialBodyList = new ArrayList<Attractor>();
	}

//==============================================================================================================================================
//Getters, Setters, Adders, Removers, and Resetters
	
	//Getters
	public ArrayList<CelestialBody> getBallList() { return ballList; }
	public ArrayList<Attractor> getCelestialBodyList() { return celestialBodyList; }
	
	//Setters
	public void setBallList(ArrayList<CelestialBody> newBallList) { ballList = newBallList; }
	public void setCelestialBodyList(ArrayList<Attractor> newCelestialBodyList) { celestialBodyList = newCelestialBodyList; }
	

}
