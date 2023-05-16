package oop.Abstraction;

public class TataGroup extends Medical implements TataPower,TataChemical {

	@Override
	public void greenEnergy() {
		System.out.println("Tata Power : greenEnergy in TataGroup");
		
	}

	@Override
	public void windEnergy() {
		System.out.println("Tata Power : windEnergy in TataGroup");
		
	}

	// Tata Group own method:
	
	public void investment() {
		
		System.out.println("Tata Group own method : investment");
		
	}
// Tata chemical
	@Override
	public void batteryProduction() {
		System.out.println("Tata chemical : batteryProduction");
		
	}
	@Override
	public void medicalRD() {
		
		System.out.println("Medical RD different class : batteryProduction");
		
	}
	

}
