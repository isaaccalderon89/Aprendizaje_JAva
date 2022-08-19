package Ejercicio08;

public class Paquete {
	private int numeroPaquete;
	private String dni;
	private double peso;
	private int prioridad;//0=nomral, 1=alta, 2= express
	
	
	//Constructor con parametro
	public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
		super();
		this.numeroPaquete = numeroPaquete;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}

	//generando getter
	public int getNumeroPaquete() {
		return numeroPaquete;
	}


	public String getDni() {
		return dni;
	}


	public double getPeso() {
		return peso;
	}


	public int getPrioridad() {
		return prioridad;
	}
	
    public String mostrarDatosPaquete() {
    	return "Numero de paquete: "+numeroPaquete
    			+"\nDNI: "+dni
    			+"\nPeso: "+peso
    			+"\nPrioridad: "+prioridad;
    }
	
	

	

}
