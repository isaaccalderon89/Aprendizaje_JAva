package Ejercicio09;

public class Rectangulo extends Poligono{
	private double lado1;
	private double lado2;

	//Constructor con parametros
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	//Getters
	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}
	//toString
	@Override
	public String toString() {
		return "Rectangulo: \n"+ super.toString()+"\nlado1= " + lado1 + ", lado2= " + lado2;
	}
	//metodos
	@Override
	public double area() {
		return lado1*lado2;
	}
	

}
