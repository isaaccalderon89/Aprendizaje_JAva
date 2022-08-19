
public class AeropuertoPrivado extends Aeropuerto {
	private String listaEmpresas[] = new String[10];
	private int numEmpresas;
	
	//Metodo constructor
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	//Segundo metodo constructor 
	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
		super(nombre, ciudad, pais, c);
		this.listaEmpresas = e;
		numEmpresas = e.length;
	}
	
	public void insertarEmpresa(String e[]) {
		this.listaEmpresas = e; 
		this.numEmpresas = e.length;
	}
	public void insertarEmpresa(String e) {
		listaEmpresas[numEmpresas] = e;
		numEmpresas++;
	}
	public String[] getListaEmpresas() {
		return listaEmpresas;
	}
	public int getNumEmpresas() {
		return numEmpresas;
	}
	
	
}
