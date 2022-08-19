
public class Compañia {
	private String nombre;
	private Vuelo listaVuelos[] = new Vuelo[10];
	private int numVuelo=0;
	
	//Metodo constructor 
	public Compañia(String nombre) {
		super();
		this.nombre = nombre;
	}
	//Sobrecarga de constructor

	public Compañia(String nombre, Vuelo v[]) {
		super();
		this.nombre = nombre;
		listaVuelos = v;
		numVuelo = v.length;
	}
	// Metodos
	public void insertarVuelo (Vuelo vuelo) {
		listaVuelos[numVuelo] = vuelo;
		numVuelo++;
	}
	//Getters

	public String getNombre() {
		return nombre;
	}

	public int getNumVuelo() {
		return numVuelo;
	}
	public Vuelo getVuelo(int i) {
		return listaVuelos[i];
	}
	public Vuelo getVuelo (String id) {
		boolean encontrado = false;
		int i = 0;
		Vuelo v = null;
		while((!encontrado)&&(i<listaVuelos.length)) {
			if(id.equals(listaVuelos[i].getIdentificador())) {
				encontrado = true;
				v = listaVuelos[i];
			}
			i++;
		}
		return v;
	}

}
