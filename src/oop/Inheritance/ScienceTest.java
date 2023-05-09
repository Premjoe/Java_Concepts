package oop.Inheritance;

public class ScienceTest {

	public static void main(String[] args) {

		WindPower wp = new WindPower();

		wp.reSearchTeam(); // Method overriding
		wp.windEnergy(); // Individual Method
		wp.mechTeam(); // Inherited Method
		wp.labTeam(); // Inherited method

		// we can override only Parent to child

		System.out.println("------");
		// Concept 2:

		new WindPower(); // This is eligible for GC

		// Child class object can be referred by parent class referred variable
		// Top casting or up casting
		G1science k = new WindPower();
		k.reSearchTeam(); // It will take overridden method , It won't take the same method from parent
							// class
		k.labTeam();
		// windEnergy(); // Java won't allow the Individual Method // Reference type
		// check

		G3PowerPlants pp = new G3PowerPlants();
		pp.centerlGoverment();

		System.out.println("-------");

		G1science top = new WindPower();

		top.mechTeam();
		top.reSearchTeam();
		top.labTeam();

	}

}
