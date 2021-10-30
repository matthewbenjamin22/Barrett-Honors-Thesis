package OrbitalMechanics;

public abstract class Gravity 
{
	
	public static double GravitationalConstant = 6.673 * Math.pow(10, -11); 
	//public static boolean considerSOIs = false;
	
	public static void calculateVelocity(OrbitalObject orbiter, Planetoid body)
	{
		//Set a common ground
		double xZeroPoint = body.getxPos();
		double yZeroPoint = body.getyPos();
		
		double xOrbiterPoint = orbiter.getxPos();
		double yOrbiterPoint = orbiter.getyPos();
		
		//Calculate Distance
		double xDistance = xOrbiterPoint - xZeroPoint;
		double yDistance = yOrbiterPoint - yZeroPoint;
		
		double totalDistance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
		
		if(totalDistance == 0)
			return;//do not calculate two points which occupy the same space - also prevents divide by 0 errors
		
		//Calculate Total Gravitational Acceleration
		double gravitationalAcceleration;
		gravitationalAcceleration = GravitationalConstant * body.getMass();
		gravitationalAcceleration = gravitationalAcceleration / (totalDistance * totalDistance);
		
		//Determine how to split the total acceleration based on x and y distance
				
	}
}
