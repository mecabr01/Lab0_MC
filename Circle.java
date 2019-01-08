
public class Circle {

	private double radius;//instance variable/field
	
	public Circle() {
		setRadius(1.0);
	}//end empty argument constructor
	
	public Circle(double r) {
		
		setRadius(r);
		
	}//end preferred constructor
	
	public double calculateArea() {
		
		double area = Math.PI * Math.pow(radius, 2.0);
		return area;
		
		//return Math.PI * Math.pow(radius, 2.0);
		
	}//end calculateArea
	
	public double getRadius() {
		return radius;
	}//end getRadious

	public void setRadius(double radius) {
		
		if (radius<1.0)
			this.radius = 1.0;
		else 
			this.radius = radius;
		
		
	}//end setRadious

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}//end toString
	
}//end class
