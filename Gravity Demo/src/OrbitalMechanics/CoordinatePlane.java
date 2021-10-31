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
	
//=================================================================================================================================================
//Functional Methods
	
	public void update()
	{
		//Two Phases, each consisting of two parts.		
		//During phase one, we will go through each satellite, and calculate it's velocity based on every attractor in the planetoid list.
		//During phase two, we will go through each planetoid, and calculate it's velocity based on every OTHER attractor in the planetoid list.
		//During phase three, we will call updatePosition on every satellite, followed by every planetoid.
		
		//Phase 1
		for(int i = 0; i < satList.size(); i++)
		{
			for(int j = 0; j < planetoidList.size(); j++)
			{
				Gravity.calculateVelocity(satList.get(i), planetoidList.get(j));
			}
		}
		//Phase 2
		for(int a = 0; a < planetoidList.size(); a++)
		{
			for(int b = 0; b < planetoidList.size(); b++)
			{
				if(a != b)
				{
					Gravity.calculateVelocity(planetoidList.get(a), planetoidList.get(b));
				}
			}
		}
		//Phase 3
		for(int x = 0; x < satList.size(); x++)
		{
			satList.get(x).updatePosition();
		}
		for(int y = 0; y < planetoidList.size(); y++)
		{
			planetoidList.get(y).updatePosition();
		}
	}
	
}
