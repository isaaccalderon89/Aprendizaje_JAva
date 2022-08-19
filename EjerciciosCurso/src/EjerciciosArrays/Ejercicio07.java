/*
 * Ejercicio 7:  Leer por teclado una serie de 10 numeros enteros. La aplicación debe indicarnos. 
 * Si los números están ordenados de forma creciente, decreciente o si están desordenados.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a[] = new  int[10];//Creamos el Array con 10 elementos
		boolean creciente = false, decreciente=false;
		
		System.out.println("LLenar el Array");
		for(int i=0; i<10;i++) {
			System.out.print((i+1)+". Introduzca un numero");
			a[i]=entrada.nextInt();
		}
		for (int i = 0; i < 9; i++) {
			if(a[i] < a[i+1]) {//Orden creciente
				creciente = true;
			}
			if(a[i] > a[i+1]) {//Orden decreciente 
				decreciente = true;
				
			}
		}
		if(creciente == true && decreciente == false) {
			System.out.println("\nEl Array esta en forma creciente");
		}
		else if (creciente == false && decreciente == true) {
			System.out.println("\nEl Array esta en forma decreciente");
		}
		else if (creciente == true && decreciente == true) {
			System.out.println("\nEl array esta desordenado");
		}
		else if(creciente == false && decreciente == false) {
			System.out.println("\nTodos los numeros del array  son iguales");
		}
	}

}
