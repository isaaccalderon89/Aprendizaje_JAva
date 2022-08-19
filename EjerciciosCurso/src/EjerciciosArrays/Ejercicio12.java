/*
 * Ejercicio 12:  Leer por teclado una tabla de 10 elementos num�ricos enteros y una posici�n (entre 0 y 9).
 * Eliminar el elemento situado en la posici�n dada sin dejar huecos.  
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int posicion;
		
		System.out.println("Rellera el array");
		for(int i=0; i<10; i++) {
			System.out.print(i+". Introduzca un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		//Pedimos la posicion en el rando de 0-9
		do {
			System.out.println("Indique una posicion entre 0 - 9: ");
			posicion = entrada.nextInt();
		} while(posicion<0 || posicion>9);
		
		//Eliminado el elemento de posicion indicada
		for(int i = posicion; i<9;i++) {
			arreglo[i] = arreglo[i+1];
		}
		
		System.out.println("\nEl array queda: ");
		for(int i=0; i<9;i++) {
			System.out.println(i+". Elemento: "+arreglo[i]);
		}

	}

}
