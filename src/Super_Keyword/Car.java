package Super_Keyword;

public class Car {
	
	int min_speed = 100;
	
public void speedMethod () {
		
		System.out.println("This is car class" +min_speed);
		
	}

	public void ev () {
		
		System.out.println("TataPunch in Parent class");
		
	}
	
	
	Car(){
		this(23);
		System.out.println("This is my car class default constructro");
	}
	
	Car(int k){
		System.out.println("This is my car class with parameter constructro " + k);
	}
	

}
