package oop.Encapsuslation;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle() { // Default Constructor
		length = 10;
		width = 20;
	}

	public Rectangle(double length, double width) { // Parametrised Constructor :

		this.length = length;
		this.width = width;
	}
// Constructor : It's one way and primary use is memory allocation and we can't read it (we can initialise the variable)

	public void setLength(double length) { // Setter method is only using for initialise the variable , It won't return
											// anything
		this.length = length;
	}

	public double getLength() { // Getter method always should be return method, It's using only for retrieve
								// the value
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double findArea() {
		return length * width;
	}

}
