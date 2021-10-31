package OrbitalMechanics;

public class Runnner 
{
	public static void main(String[] args)
	{
		CoordinatePlane cp = new CoordinatePlane();
		
		Planetoid earth = new Planetoid("Earth");
		earth.setMass(100);
		earth.setPosition(0.0, 0.0);
		earth.setVelocity(0, 0);
		
		Satellite sat = new Satellite("Satellite");
		sat.setPosition(0, 10.0);
		sat.setVelocity(10, 0);
		
		cp.addPlanetoid(earth);
		cp.addSat(sat);
		
		int x = 0;
		while(x < 10)
		{
			cp.getPlanetoidList().get(0).print();
			System.out.println("\n");
			cp.getSatList().get(0).print();
			System.out.println("--------------------------------------------------------------");
			cp.update();
			Clock.tick(1);
			x++;
		}
	}
}
