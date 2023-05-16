package oop.Abstraction;

public class Fortis_Runner_Class {

	public static void main(String[] args) {
		FortisHospital_Organization obj = new FortisHospital_Organization();
		// US Medical
		obj.physioServices();
		obj.cardioServices();
		obj.entServices();
		System.out.println("Inheritated the parents interface Variable - class Interface  " + USMedical.min_fee);
		System.out.println("Variable can access with child class name also Like this we can access only variable not method" + FortisHospital_Organization.min_fee);
		
		USMedical.USMedPharmacy();
		obj.billing();
		 
		
		// UK Medical
		obj.neuroServices();
		obj.orthoServices();
		
		// India Medical
		obj.oncologyServices();
		obj.dentalServices();
		obj.gynecologistServices();
		
		// Own Method
		obj.medicalTraining();
		
		
		// can not create the Interface for object
		// Implementation Level always done with the class level
		// USMedical k= new USMedical();
		
		
		// Top Casting 
		// Child class object can be refereed by parent interface reference variable 
		USMedical us= new FortisHospital_Organization();
		us.physioServices();
		us.cardioServices();
		us.entServices();
		
		
		
		
		
		
	}

}
