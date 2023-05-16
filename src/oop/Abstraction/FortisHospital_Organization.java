package oop.Abstraction;

public class FortisHospital_Organization extends Medical implements USMedical,UKMedical,IndiaMedical {
	
	// Interface can not have any parent class 
    
	
	// US Medical
	
	@Override
	public void physioServices() {
		
		System.out.println("FortisHospital --- physioServices ");
		
	}

	@Override
	public void cardioServices() {
		
		System.out.println("FortisHospital --- cardioServices ");
	}

	@Override
	public void entServices() {
		
		System.out.println("FortisHospital --- entServices ");
		
	}
	

	@Override
	public void test(int a) {
		
		
	}

	@Override
	public String get(int a, int b) {
		
		return null;
	}
	
    // UK Medical
	@Override
	public void oncologyServices() {
		
		System.out.println("FortisHospital --- oncologyServices ");
	}

	@Override
	public void dentalServices() {
		System.out.println("FortisHospital --- dentalServices ");
		
	}

		// Indian Medical
	@Override
	public void gynecologistServices() {
		System.out.println("FortisHospital --- gynecologistServices ");
		
	}

	@Override
	public void neuroServices() {
		
		System.out.println("FortisHospital --- neuroServices ");
	}

	@Override
	public void orthoServices() {
		
		System.out.println("FortisHospital --- orthoServices ");
		
	}

	public void medicalTraining () {
		
		System.out.println("FH - Own method : medical Training");
		
	}
	
  public void medicalInsurance () {
		
		System.out.println("FH - Own method : medical Training");
		
	}
	
  // Common Method for all the child class
	@Override
	public void emergencyServics() {
		
	}
	
	// WHO 

	@Override
	public void covidVaccination() {
		System.out.println("FH - WHO : covidVaccination");
		
	}

	// UN
	@Override
	public void medicalNews() {
		
		System.out.println("FH - UN : medicalNews");
	}


}
