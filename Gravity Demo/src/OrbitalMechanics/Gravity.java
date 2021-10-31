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
		gravitationalAcceleration = GravitationalConstant * orbiter.getMass() * body.getMass();
		gravitationalAcceleration = gravitationalAcceleration / (totalDistance * totalDistance);
		
		//Determine how to split the total acceleration based on the angle
		double angle = Math.asin(yDistance / totalDistance);
		
		//Now apply the formula
		double xAcceleration = Math.cos(angle) * gravitationalAcceleration;
		double yAcceleration = Math.sin(angle) * gravitationalAcceleration;
		
		if(orbiter.getMass() != 0)//Avoids divide-by-zero errors while allowing for massless particles
		{
			xAcceleration /= orbiter.getMass();
			yAcceleration /= orbiter.getMass();
		}
		
		//Now apply those new accelerations
		orbiter.addVelocity(xAcceleration, yAcceleration);
	}
}
