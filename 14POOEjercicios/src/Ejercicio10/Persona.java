package Ejercicio10;

public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	//Constructor
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	//Getter

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}
	//Metodo
	public void viajar() {
		System.out.println("Viajar");
	}
	public abstract void partidoFutbol();
	
	public abstract void entrenamiento();

}
