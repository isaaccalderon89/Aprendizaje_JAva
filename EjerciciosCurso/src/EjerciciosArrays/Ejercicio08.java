/*
 * Ejercicio 8:  Dise?ar una aplicaci?n que declare una tabla de 10 elementos enteros. 
 * Leer mediante el teclado 8 n?meros. despu?s se debe pedir un n?mero y una posici?n, 
 * insertarlo en la posici?n indicada, desplazando los que est?n detr?s.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner (System.in);
		int array[] = new int[10]; //Creamos el arreglo de 10 elementos enteros
		int numero, posicion;
		
		
		System.out.println("Rellenamos el Array");
		for(int i=0;i<8;i++) {
			System.out.print((i)+". Introduzca un numero: ");
			array[i]=entrada.nextInt();
		}

		System.out.print("\nIntroduzca un numero: ");
		numero = entrada.nextInt();
		System.out.print("\nIntroduzca una posicion: ");
		posicion = entrada.nextInt();
		
		// correr una posicion los elementos detras de la posicion que el usuario quiere
		for(int i =7; i>= posicion;i--) {
			array[i+1] = array[i];
		}
		
		array[posicion] = numero; //insertamos el numero en la posicion requerida
		
		System.out.println("El nuevo Array es: ");
		for(int i=0;i<9;i++) {
			System.out.println("Posicion "+i+": "+array[i]);
		}
	}

}
