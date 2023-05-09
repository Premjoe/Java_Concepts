package oop.Encapsuslation;

public class RegisterEnscaConstru {

	private String name;
	private int age;
	private long phoneNumber;
	private String location;
	private boolean isPermenant;

	// Constructor :
	public RegisterEnscaConstru(String name, int age, long phoneNumber, String location, boolean isPermenant) {

		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.isPermenant = isPermenant;
	}

	// Constructor :
	public RegisterEnscaConstru(long phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	// Getters and Setters :

	// Getter is mandatory and we can avoid the setters
	// What is the important of setters : For updating the user values ex : age

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isPermenant() {
		return isPermenant;
	}

	public void setPermenant(boolean isPermenant) {
		this.isPermenant = isPermenant;
	}

}
