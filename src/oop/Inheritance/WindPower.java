package oop.Inheritance;

public class WindPower extends G1science { // wind power is the sub class G1science is the Super class

	// Method overriding : (Decision will take in run time )
	// If i have same method in Parent class and child class
	// java will take the child class and this is called method overriding
	// When we have a method in parent class and the same method in child class:
	// Same method name
	// Same number for Parameter+
	// Same sequence / order of the parameter
	// Same return Type
	
	
// First Preference for overridden method child class , when we are override the method, compiler wont take any decision, In Run time it will take decision
	@Override
	public void reSearchTeam() {

		System.out.println("This is windpower sub class  : reSearch Team Method");

	}

	public void windEnergy() {
		System.out.println("This is windpower sub class  : wind energy Method");
	}

}
