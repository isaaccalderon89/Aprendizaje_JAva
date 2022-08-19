package Ejercicio10;

public class Entrenador extends Persona {
	private String estrategia;

	//Constructor con parametros
	public Entrenador(String nombre, String apellidos, int edad, String estrategia) {
		super(nombre, apellidos, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}
	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un partido de futbol");
	}
	@Override
	public void entrenamiento() {
		System.out.println("El entrenador dirige un entrenamiento");
	}
	public void planificarEntrenamiento() {
		System.out.println("Planificar entrenamiento");
	}
	

}
