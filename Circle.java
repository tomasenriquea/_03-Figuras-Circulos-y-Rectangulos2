package uF4.trabajos.A2_03_10_2018._03;

public class Circle extends Shape{  // Circulo
	
	private double radius;
	
	
	//CONSTRUCTOR	
	public Circle() {
		super();
		this.radius = 0;
	}
	
	
	
	public Circle(Point org, double rad) {
		super(org);
		this.radius = rad;
	}

	
	//GETTER
	public double getRadius() {
		return radius;
	}


	//SETTER
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	// METODOS SOBRESCRITOS
	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

	
	@Override
	public double perimetro() {
		return 2 * Math.PI * radius;
	}
	
	
	
	
}
