
public class Vuelo {
	private String identificador;
	private String ciudadOrigen;
	private String ciudadDestino;
	private double precio;
	private int numMaxPasajeros;
	private int numActualPasajeros;
	private Pasajero listaPasajero[];
	
	//Metodo Constructor
	public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
		super();
		this.identificador = identificador;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.precio = precio;
		this.numMaxPasajeros = numMaxPasajeros;
		this.numActualPasajeros = 0;
		this.listaPasajero = new Pasajero [numMaxPasajeros];
	}
	//Metodo getters
	public String getIdentificador() {
		return identificador;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNumMaxPasajeros() {
		return numMaxPasajeros;
	}

	public int getNumActualPasajeros() {
		return numActualPasajeros;
	}
	
	//Metodos
	public void insertarPasajero(Pasajero pasajero) {
		listaPasajero[numActualPasajeros] = pasajero;
		numActualPasajeros++;
	}

	public Pasajero getPasajero(int i) {
		return listaPasajero[i];
	}
	public Pasajero getPasajero(String pasaporte) {
		boolean encontrado = false;
		int i=0; 
		Pasajero pas= null;
		while ((!encontrado)&&(i<listaPasajero.length)) {
			if(pasaporte==listaPasajero[i].getPasaporte()) {
				encontrado = true;
				pas = listaPasajero[i];
			}
			i++;
		}
		return pas;
	}

	
}
