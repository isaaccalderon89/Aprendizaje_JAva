package variables;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre:");
		Scanner consola = new Scanner(System.in); // con esta variable definimos lo que el usuario nos intrduce en consola
		
		var usuario = consola.nextLine();
		System.out.println("Usuario = " + usuario);
		
		System.out.println("Escribe el titulo: ");
		var titulo = consola.nextLine();
		System.out.println("Resultado: " + titulo + " " + usuario);
	}

}
