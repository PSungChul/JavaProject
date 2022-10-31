package ex03_abstract;

public class zerg extends Unit{
	
	public zerg( String name, int energy, boolean fly ) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy -= 10;
	}

}
