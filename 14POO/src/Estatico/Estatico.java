package Estatico;

public class Estatico {
	
	//Al tener el atributo el modo ESTATICO hace que no pertenezca a un atributo sino a una calse
	//Tambien existen los metodos ESTATICOS. No pertenecen al objeto, pertenece a la clase.
	
	private static String frase = "Primera frase";

	public static void main(String[] args) {
		Estatico ob1 = new Estatico();
		Estatico ob2 = new Estatico();
		
		ob2.frase = "Segunda frase";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		
	
	}

}
