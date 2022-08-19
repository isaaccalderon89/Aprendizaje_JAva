package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
	private int nPuertas;
	
	//generamos constructor
	public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.nPuertas = nPuertas;
	}
	
	//generamos getter
	public int getnPuertas() {
		return nPuertas;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nNumero de Puertas: "+nPuertas;
	}

}
