/*
 * Harshil Shah
 */
public class Rectangle extends Shape{

	
	private double base;
	private double height;
	
	public Rectangle()
	{
		this.base = 0.0;
		this.height = 0.0;
	}
	public Rectangle(double aB, double aH)
	{
		super();
		this.setH(aH);
		this.setB(aB);		
		super.setName("Rectangle");
		super.setArea(aB*aH);
	}
	public double getB() {
		return base;
	}
	public void setB(double b) {
		this.base = b;
	}
	public double getH() {
		return height;
	}
	public void setH(double h) {
		this.height = h;
	}
	public String toString()
	{
		return "Rectangle Side 1: "+base+" Side 2: "+height+super.toString();
	}
	
}
