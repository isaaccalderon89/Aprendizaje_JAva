package Ejercicio09;

public abstract class Poligono {
	protected int numeroLados;
	
	//generamos el constructor
	
	public Poligono(int numeorLados) {
		super();
		this.numeroLados = numeroLados;
	}

	//Getters
	public int getNumeroLados() {
		return numeroLados;
	}

	//toString
	@Override
	public String toString() {
		return "Numero de Lados=" + numeroLados;
	}
	
	//Declaramos el metodo area como abstracto
	public abstract double area();
	

}
