/*
 * Ejercicio 9:  Crear un programa que lea por teclado una tabla de 10 numeros enteros 
 * y la desplace una posición hacia abajo: el primero para a ser el segundo, 
 * el segundo para a ser el tercero y asi sucesivamente. El ultimo pasa a ser el primero.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner (System.in);
		int arreglo[] = new int[10]; //Creamos el arreglo de 10 elementos enteros
		int ultimo;
		
		System.out.println("Llenar el Array");
		for(int i=0; i<10;i++) {
			System.out.print(i+". Introduzca un numero: ");
			arreglo[i]=entrada.nextInt();
		}
		ultimo = arreglo[9]; //Guardamos el ultimo elelmento del Array
		
		for(int i=8; i>=0;i--) {
			arreglo[i+1]= arreglo[i];
		}
		
		arreglo[0] = ultimo;//Ponemos el ultimo numero como primero
		
		System.out.println("\nEl nuevo arreglo es: ");
		for(int i=0; i<10; i++) {
			System.out.println(i+". Numero: "+arreglo[i]);
		}

	}

}
