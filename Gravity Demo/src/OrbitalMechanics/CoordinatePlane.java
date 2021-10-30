package OrbitalMechanics;
/**
 * @author matth
 *
 */

import java.util.ArrayList;

public class CoordinatePlane 
{	
	//Instance Variables
	private ArrayList<OrbitalObject> satList;
	private ArrayList<Planetoid> planetoidList;
	
	//Constructor
	public CoordinatePlane()
	{
		satList = new ArrayList<OrbitalObject>();
		planetoidList = new ArrayList<Planetoid>();
	}

//==============================================================================================================================================
//Getters, Setters, Adders, Removers, and Resetters
	
	//Getters
	public ArrayList<OrbitalObject> getBallList() { return satList; }
	public ArrayList<Planetoid> getCelestialBodyList() { return planetoidList; }
	
	//Setters
	public void setBallList(ArrayList<OrbitalObject> newBallList) { satList = newBallList; }
	public void setCelestialBodyList(ArrayList<Planetoid> newCelestialBodyList) { planetoidList = newCelestialBodyList; }
	

}
