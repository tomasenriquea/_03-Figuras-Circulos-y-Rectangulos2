package uF4.trabajos.A2_03_10_2018._03;


public class Shape {  // Forma o figura
	
	private Color color;
	private Point origen;
	
	
	//CONSTRUCTORES
	protected Shape() {
		color = null;
		origen = null;
	} 
	
	protected Shape(Point org) {
		this.origen = org;
	} 
	
	protected Shape(Color col, Point org) {
		this.color = col;
		this.origen = org;
	}
	
	
	//GETTERS
	public Color getColor() {
		return color;
	}

	public Point getOrigen() {
		return origen;
	}

	//SETTERS
	public void setColor(Color color) {
		this.color = color;
	}

	public void setOrigen(Point origen) {
		this.origen = origen;
	}
	
	
	//METODOS DE CALCULOS
	public double area() {
		return 0;
	}
	
	
	public double perimetro() {
		return 0;
	}
	
	

	
	//DETALLES 
	public void detalleCoordenada() {
		System.out.println("Posicion X: " + origen.getX() + 
						   "\nPosicion Y: " + origen.getY());
	} 
		

	public void detalleColor() {
		System.out.println("Rojo: " + color.getRed() + 
						   "\nVerde: " + color.getGreen() + 
						   "\nAzul: " + color.getBlue());
	}
}  