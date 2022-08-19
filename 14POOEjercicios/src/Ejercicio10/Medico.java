package Ejercicio10;

public class Medico extends Persona {
	private String titulacion;
	private int a�osexperiencia;
	
	//Constructor
	public Medico(String nombre, String apellidos, int edad, String titulacion, int a�osexperiencia) {
		super(nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.a�osexperiencia = a�osexperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getA�osexperiencia() {
		return a�osexperiencia;
	}
	
	public void partidoFubol() {
		System.out.println("Da asistecia en un partido de futbol");
	}
	public void entrenamineto() {
		System.out.println("Da asistecia en un entrenamiento");
	}
	public void curarLesion() {
		System.out.println("Curar Lesion");
	}

}