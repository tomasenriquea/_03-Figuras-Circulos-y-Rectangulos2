package uF4.trabajos.A2_03_10_2018._03;

import java.util.Scanner;



public class Main {
	
	// Esto es para mostrar el menú de opciones.
	public static int menu() {
		
		System.out.println("\n\n\n");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||||||||||||||||||||FIGURAS|||||||||||||||||||");
		System.out.println();
		System.out.println("1. Crear un circulo.\n" + 
						   "2. Crear un rectangulo.\n" + 
						   "0. Salir.");
			
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngrese un numero: ");
		int dato = sc.nextInt();
		
		return dato;
	}
	
	
	public static void main(String[] args) {
		
		int respuesta;
		@SuppressWarnings("resource")  // Sirve para poder eliminar las advertencias. No recomendado segun el punto.
		Scanner sc = new Scanner(System.in); 
		
		do {
			respuesta = menu();
			
			switch(respuesta){
			
			case 1:
				Circle circulo = new Circle();  // Creo un circulo
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\nIngrese la combinación de color para el circulo.");
				System.out.print("Rojo: ");
				float red = sc.nextFloat();
				
				System.out.print("Verde: ");
				float green = sc.nextFloat();
				
				System.out.print("Blue: ");
				float blue = sc.nextFloat();
				
				Color color = new Color(red, green, blue);  // Combinación de colores principales para un color.
				circulo.setColor(color);  // Se le asigna un color
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\nIngrese la ubicación de la figura.");
				System.out.print("Coordenada X: ");
				float x = sc.nextFloat();
				
				System.out.print("Coordenada Y: ");
				float y = sc.nextFloat();
				
				Point point = new Point(x, y);  // Coordenada establecida de una posicion.
				circulo.setOrigen(point);  // Se le asigna una posicion
				
				//----------------------------------------------------------------------------------------------
				System.out.print("\nIngrese el radio del circulo: ");
				double radio = sc.nextDouble();
				circulo.setRadius(radio);  // se agina el radio del circulo
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\n\n#######################################################");
				System.out.println("\nEl circulo a crear tiene los siguientes detalles:\n");
				
				System.out.println("Perimetro: " + circulo.perimetro() + // se muestra el calculo del perimetro
						   		   "\nArea: " + circulo.area());  // se muestra el calculo del area
				
				System.out.println("\nCombinacion de color");
				circulo.detalleColor();  //Aqui los detalles del color y de la posicion.
				
				System.out.println("\nUbicacion del circulo");
				circulo.detalleCoordenada(); //Aqui los detalles de la posicion.
				
				System.out.println("\nCirculo creado!!!\n");
				System.out.println("#######################################################\n\n");
				break;
				
			case 2:
				Rectangle rectangulo = new Rectangle();  // Crea un rectangulo.
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\nIngrese la combinación de color para el rectangulo.");
				System.out.print("Rojo: ");
				float red1 = sc.nextFloat();
				
				System.out.print("Verde: ");
				float green1 = sc.nextFloat();
				
				System.out.print("Blue: ");
				float blue1 = sc.nextFloat();
				
				Color color1 = new Color(red1, green1, blue1);  // Combinación de colores principales para un color.
				rectangulo.setColor(color1);  // Se le asigna un color
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\nIngrese la ubicación de la figura.");
				System.out.print("Coordenada X: ");
				float x1 = sc.nextFloat();
				
				System.out.print("Coordenada Y: ");
				float y1 = sc.nextFloat();
				
				Point point1 = new Point(x1, y1);  // Coordenada establecida de una posicion.
				rectangulo.setOrigen(point1);  // Se le asigna una posicion
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\nIngrese el alto y ancho del rectangulo.");
				
				System.out.print("Alto: ");
				double alto = sc.nextDouble();
			
				System.out.print("Ancho: ");
				double Ancho = sc.nextDouble();
				
				rectangulo.setHW(alto, Ancho);  // Se asigna el valor del alto y ancho.
				
				//----------------------------------------------------------------------------------------------
				System.out.println("\n\n#######################################################");
				System.out.println("\nEl rectangulo a crear tiene los siguientes detalles:\n");
				
				System.out.println("Perimetro: " + rectangulo.perimetro() + // se muestra el calculo del perimetro
						   		   "\nArea: " + rectangulo.area());  // se muestra el calculo del area
				
				System.out.println("\nCombinacion de color");
				rectangulo.detalleColor();  //Aqui los detalles del color y de la posicion.
				
				System.out.println("\nUbicacion del rectangulo");
				rectangulo.detalleCoordenada(); //Aqui los detalles de la posicion.
				
				System.out.println("\nRectangulo creado!!!\n");
				System.out.println("#######################################################\n\n");
				break;
			}
	
		}while(respuesta != 0);
		
		
		
		
		
		
		
		/*
		Color color = new Color(100f, 150f, 200f);  // Combinación de colores principales para un color.
		Point point = new Point(23.3f, 45.4f);  // Coordenada establecida de una posicion
		
		
		System.out.println("CIRCULO");
		Circle circulo = new Circle();  // Creo un circulo
		circulo.setColor(color);  // Se le asigna un color
		circulo.setOrigen(point);  // Se le asigna una posicion
		
		circulo.setRadius(6);  // se agina el radio del circulo
		
		System.out.println("Perimetro: " + circulo.perimetro() + // se muestra el calculo del perimetro
						   "\nArea: " + circulo.area());  // se muestra el calculo del area
		
		System.out.println("\nCombinacion de color");
		circulo.detalleColor();  //Aqui los detalles del color y de la posicion.
		
		System.out.println("\nUbicacion del circulo");
		circulo.detalleCoordenada();  //Aqui los detalles de la posicion.
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("RECTANGULO");
		Rectangle rectangulo = new Rectangle();
		rectangulo.setColor(color);
		rectangulo.setOrigen(point);
		
		rectangulo.setHW(4, 8);  // Se asigna el valor del alto y ancho.
		
		System.out.println("Perimetro: " + rectangulo.perimetro() + // se muestra el calculo del perimetro
				   		   "\nArea: " + rectangulo.area());  // se muestra el calculo del area
		
		
		System.out.println("\nCombinacion de color");
		rectangulo.detalleColor();  //Aqui los detalles del color y de la posicion.
		
		System.out.println("\nUbicacion del circulo");
		rectangulo.detalleCoordenada();  //Aqui los detalles de la posicion.
		*/
		
	}
}


/*Figuras: círculos y rectángulos.

Diseñar una aplicación para representar figuras siguiendo el diagrama de clases siguiente, cree un círculo y un rectángulo y 
practica con cada uno de los métodos de estas figuras.

Indicaciones: La clase Color guarda un color RGB, la clase Point guarda las coordenadas x e y.
En el diagrama - significa private, + significa público mientras que # protected.


En la clase main debe probar los métodos que ha hecho. En concreto:
Debe crear:
un círculo y un rectángulo y mostrar de ambos su área, su perímetro, la posición donde se encuentra (Point) y el color que tienen.
*/