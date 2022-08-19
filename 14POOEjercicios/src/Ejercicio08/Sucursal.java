package Ejercicio08;

public class Sucursal {
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	//Constructor con parametos
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		super();
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	
	//metodos getters
	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	public String mostrarDatosSucursal() {
		return "Numero Sucursal: "+numeroSucursal
				+"\nDireccion: "+direccion
				+"\nCiudad: "+ciudad;
	}
	public double calcular_precio(Paquete t) {
		double precio;
		precio = t.getPeso();
		if (t.getPrioridad()==1) {
			precio +=10;
			
		}
		if(t.getPrioridad()==2){
			precio +=20;
		}
		
		return precio;
	}

	

}
