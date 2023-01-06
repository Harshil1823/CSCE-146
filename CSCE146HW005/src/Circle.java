/*
 * Harshil Shah
 */
public class Circle extends Shape {

	private double radius;	
	public Circle()
	{
		this.radius = 0.0;
	}
	public Circle(double aR)
	{
		super();
		this.setR(aR);
		super.setName("Circle");
		super.setArea(radius*radius*Math.PI);
	}
	public double getR() {
		return radius;
	}
	public void setR(double r) {
		this.radius = r;
	}
	public String toString()
	{
		return "Circle Radius: "+radius+super.toString();
	}
	
	
	
}
