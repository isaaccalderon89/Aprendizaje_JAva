import java.util.Scanner;

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	final static int num = 4; //Numero de aeropuertos
	static Aeropuerto aeropuertos[] = new Aeropuerto[num];
	

	public static void main(String[] args) {
		
		//inserta datos de los aeropuertos
		insertarDatosAeropuerto(aeropuertos);
		menun();

	}
	public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
		aero[0] = new AeropuertoPublico(80000000, "Jorge Chavez", "Lima", "Peru");
		aero[0].insertarCompa�ia(new Compa�ia("AeroPeru"));
		aero[0].insertarCompa�ia(new Compa�ia("LATAM"));
		aero[0].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90,150));
		aero[0].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99,120));
		aero[0].getCompa�ia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90,180));
		aero[0].getCompa�ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGHP","Peruana"));
		aero[0].getCompa�ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Isaac", "5367PJKl","Espa�ola"));
		aero[0].getCompa�ia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("joel", "30BGHP","Peruana"));
		
		aero[1] = new AeropuertoPublico(40000000, "Madrid-Barajas", "Madrid", "Espa�a");
		aero[1].insertarCompa�ia(new Compa�ia("Iberia"));
		aero[1].insertarCompa�ia(new Compa�ia("RYANair"));
		aero[1].getCompa�ia("Iberia").insertarVuelo(new Vuelo("IBE220", "Madrid", "Mexico", 1150.90,150));
		aero[1].getCompa�ia("Iberia").insertarVuelo(new Vuelo("IBE221", "Madrid", "Buenos Aires", 1180.99,120));
		aero[1].getCompa�ia("RYANair").insertarVuelo(new Vuelo("RY12", "Madrid", "Londres", 500.90,180));
		aero[1].getCompa�ia("Iberia").getVuelo("IB20").insertarPasajero(new Pasajero("Alba Sevilla", "20BGHP","Valenciana"));
		aero[1].getCompa�ia("Iberia").getVuelo("IB20").insertarPasajero(new Pasajero("Ana Hermana", "5367PJKl","Espa�ola"));
		aero[1].getCompa�ia("RYANair").getVuelo("FC12").insertarPasajero(new Pasajero("Ruben Firulais", "30BGHP","Espa�ola"));
		
		aero[2] = new AeropuertoPublico(50000000, "CaCahuetes", "Valencia", "Espa�a");
		aero[2].insertarCompa�ia(new Compa�ia("American"));
		aero[2].insertarCompa�ia(new Compa�ia("EasyJET"));
		aero[2].getCompa�ia("American").insertarVuelo(new Vuelo("IBE550", "Valencia", "Mexico", 1150.90,150));
		aero[2].getCompa�ia("American").insertarVuelo(new Vuelo("IBE661", "Valencia", "Buenos Aires", 1180.99,120));
		aero[2].getCompa�ia("EasyJET").insertarVuelo(new Vuelo("RY12", "Valencia", "Londres", 500.90,180));
		aero[2].getCompa�ia("American").getVuelo("IBE550").insertarPasajero(new Pasajero("JuanJose Sevilla", "20BGHP","Valenciana"));
		aero[2].getCompa�ia("American").getVuelo("IBE661").insertarPasajero(new Pasajero("Berta Benaches", "5367PJKl","Espa�ola"));
		aero[2].getCompa�ia("EasyJET").getVuelo("RY12").insertarPasajero(new Pasajero("Isaac Firulais", "30BGHP","Espa�ola"));
		
		aero[3] = new AeropuertoPublico(60000000, "El prat", "Barcelona", "Espa�a");
		aero[3].insertarCompa�ia(new Compa�ia("Colombiana"));
		aero[3].insertarCompa�ia(new Compa�ia("ISRAELines"));
		aero[3].getCompa�ia("Colombiana").insertarVuelo(new Vuelo("IBE330", "Barcelona", "Mexico", 1150.90,150));
		aero[3].getCompa�ia("Colombiana").insertarVuelo(new Vuelo("IBE331", "Barcelona", "Buenos Aires", 1180.99,120));
		aero[3].getCompa�ia("ISRAELines").insertarVuelo(new Vuelo("IR12", "Barcelona", "Londres", 500.90,180));
		aero[3].getCompa�ia("Colombiana").getVuelo("IBE330").insertarPasajero(new Pasajero("Alba Sevilla", "20BGHP","Valenciana"));
		aero[3].getCompa�ia("Colombiana").getVuelo("IBE331").insertarPasajero(new Pasajero("Ana Hermana", "5367PJKl","Espa�ola"));
		aero[3].getCompa�ia("ISRAELines").getVuelo("IR12").insertarPasajero(new Pasajero("Ruben Firulais", "30BGHP","Espa�ola"));
		
	}
	public static void menun() {
		int opcion;
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1. Ver aeropuertos gestionados (Publicos o privados)");
			System.out.println("2. Ver empresas (Privado) o subvencion (Publico)");
			System.out.println("3. Mostrar lista de compa�ias de un aeropuerto.");
			System.out.println("4. Lista de vuelos por comp�ia");
			System.out.println("5. Listar posibles vuelos de origen a destino");
			System.out.println("6. Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1: //Ver aeropuertos gestionados (Publicos o privados)
					System.out.println("");
					mostrarDatosAeropuertos(aeropuertos);
					break;
			case 2: //Ver empresas (Privado) o subvencion (Publico)
					break;
			case 3: //Mostrar lista de compa�ias de un aeropuerto.
					break;
			case 4: //Lista de vuelos por comp�ia
					break; 
			case 5: //Listar posibles vuelos de origen a destino
					break;
			case 6: break;
			default: System.out.println("Error, eres un pelele");
			}
			System.out.println(" ");
		}while(opcion !=6);
	}

	public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
		for(int i=0;i<aeropuertos.length;i++) {
			if(aeropuertos[i] instanceof AeropuertoPrivado) {
				System.out.println("Aeropuerto Privado");
				System.out.println("Nombre: "+aeropuertos[i].getNombre());
				System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
				System.out.println("Pais: "+aeropuertos[i].getPais());
			}
			else {
				System.out.println("Aeropuerto Publico");
				System.out.println("Nombre:"+aeropuertos[i].getNombre());
				System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
				System.out.println("Pais: "+aeropuertos[i].getPais());
			}
			System.out.println("");
		}
		
	}
	
	//REVISAR CODGO NO SALE VIDEO n�157
}
