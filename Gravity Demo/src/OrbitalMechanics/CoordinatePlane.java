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
	public ArrayList<OrbitalObject> getSatList() { return satList; }
	public ArrayList<Planetoid> getPlanetoidList() { return planetoidList; }
	
	//Setters
	public void setSatList(ArrayList<OrbitalObject> newBallList) { satList = newBallList; }
	public void setPlanetoidList(ArrayList<Planetoid> newCelestialBodyList) { planetoidList = newCelestialBodyList; }
	
	//Adders
	public void addSat(OrbitalObject newSat) { satList.add(newSat);	}
	public void addPlanetoid(Planetoid newPlanetoid) { planetoidList.add(newPlanetoid); }
	
	
	
}
