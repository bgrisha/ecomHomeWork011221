package ecomHomeWork011221;

public class Cirlce {
	private double radius;

	public Cirlce(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void printSize(Cirlce c) {
	    double area = radius * radius * Math.PI;
	    System.out.println("The area of the circle [radius = " + radius + "]: " + area);
	}
}
