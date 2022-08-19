/*
 * Ejercicio 10:  Crear un programa que lea por teclado una tabla de 10 números enteros 
 * y desplace N posiciones en el arreglo (N es digitado por el usuario).
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner (System.in);
		int arreglo[]= new int[10]; // Creamos el arreglo con 10 elemenos enteros
		int n_posicion, ultimo;
		
		System.out.println("LLenar el Array: ");
		for(int i=0; i<10;i++) {
			System.out.println(i+". Introduzca un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		System.out.println("\n Inroduzca cuantas posiciones quiere desplazar: ");
		n_posicion = entrada.nextInt();
		
		for(int vuelta = 1; vuelta<=n_posicion;vuelta++) {
			ultimo = arreglo[9]; // guardamos el ultimo elementoa del Array
			for (int i=8; i<=0;i--) { // desplazamos una posicion en el Array
				arreglo[i+1] = arreglo [i];
			}
			arreglo[0] = ultimo;
		}
		
		System.out.println("\nEl arreglo resultante es: ");
		for(int i=0;i<10;i++) {
			System.out.println(i+". Elemento: "+arreglo[i]);
		}
		
	}

}
