package oop.Encapsuslation;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle obj = new Rectangle();
		System.out.println("Output for Default Constructor : " + obj.findArea());

		System.out.println("--------");

		Rectangle obj2 = new Rectangle(10, 50);
		System.out.println("Output for Parametrised Constructor : " + obj2.findArea());

		System.out.println("--------");

		Rectangle obj3 = new Rectangle();
		obj3.setLength(14);
		obj3.setWidth(11);
		double ll = obj3.getLength();
		System.out.println(ll);
		double ww = obj3.getWidth();
		System.out.println(ww);
		System.out.println("Output for Setter with Getter : " + obj3.findArea());
		System.out.println(obj3.getLength());

	}

}
