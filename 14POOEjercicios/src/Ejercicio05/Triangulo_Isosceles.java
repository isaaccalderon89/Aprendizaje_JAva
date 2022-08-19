package Ejercicio05;

public class Triangulo_Isosceles {
	private double base;
	private double lado;
	
	//Constructor
	public Triangulo_Isosceles(double base, double lado) {
		super();
		this.base = base;
		this.lado = lado;
	} 
	
	public double obtenerPerimetro() {
		double perimetro = 2*lado+base;
		return perimetro;
	}
	public double obtenerArea() {
		double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
		return area;
	}
	public String mostrarDatos() {
		return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea()+"\n";
	}
	
	

}
