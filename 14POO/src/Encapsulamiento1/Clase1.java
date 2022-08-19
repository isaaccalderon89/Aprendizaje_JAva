//Encapsulamiento y métodos accesores (Setters y Getters)

package Encapsulamiento1;

public class Clase1 {
	
	private int edad;
	private String nombre;
	
	//Metodo Setter: Establecemos la edad
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Metodo Getter: Mostramos la edad
	public String getNombre() {
		return nombre;
	}

	//Metodo Setter: Establecemos la edad
	public void setEdad(int edad) {
		this.edad = edad;
	}
	// Metodo Getter: Mostramos la edad
	public int getEdad() {
		return edad;
	}

}
