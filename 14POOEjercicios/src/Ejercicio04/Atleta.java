package Ejercicio04;

public class Atleta {
	private int numeroAtleta;
	private String nombre;
	private float tiempoCarrera;
	
	//constructor
	public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
		super();
		this.numeroAtleta = numeroAtleta;
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
	}

	public float getTiempoCarrera() {
		return tiempoCarrera;
	}
	
	public String mostrarDatosGanador() {
		return"Numero de Atleta: "+numeroAtleta+"\nNombre de Atleta: "+nombre+"\nTiempo de Carrera: "+tiempoCarrera+"\n";
	}
	
	

}
