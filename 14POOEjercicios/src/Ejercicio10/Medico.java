package Ejercicio10;

public class Medico extends Persona {
	private String titulacion;
	private int añosexperiencia;
	
	//Constructor
	public Medico(String nombre, String apellidos, int edad, String titulacion, int añosexperiencia) {
		super(nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.añosexperiencia = añosexperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public int getAñosexperiencia() {
		return añosexperiencia;
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
