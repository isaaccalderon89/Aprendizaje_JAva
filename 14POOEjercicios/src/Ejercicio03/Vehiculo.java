package Ejercicio03;

public class Vehiculo {
	private String marca; 
	private String modelo;
	private float precio;
	
	//constructor
	public Vehiculo(String marca, String modelo, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
	}
	
	

}
