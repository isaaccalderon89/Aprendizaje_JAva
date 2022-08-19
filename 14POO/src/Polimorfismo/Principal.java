package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
		misVehiculos[1] = new VehiculoTurismo(4 , "78HJ", "Audi", "p14");
		misVehiculos[2] = new VehiculoDeportivo(500, "45GH", "Toyota", "kj8");
		misVehiculos[3] = new VehiculoFurgoneta(2000, "J18", "Toyota", "J9");
		
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
	}

}
