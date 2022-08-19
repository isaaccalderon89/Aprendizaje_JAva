
public class CaracteresEspeciales {

	public static void main(String[] args) {
		
		String nombre = "Isaac";
		
		System.out.println("Nueva linea: \n" + nombre); // generamos un salto de linea
		System.out.println("************************");
		System.out.println("Tabulador: \t" + nombre);//genramos un tabulador
		System.out.println("************************");
		System.out.println("Retroceso: \b" + nombre);//retrocede una posicion, si se pone mas caracteres retrocede mas posiciones
		System.out.println("************************");
		System.out.println("Comillas simple: \'" + nombre +"\'");// envolvemos el nombre en comillas simple
		System.out.println("Comillas doble : \" " + nombre + "\"");// envolvemos el nombre en comillas dobles
	}

}
