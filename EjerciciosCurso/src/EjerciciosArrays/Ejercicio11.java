/*
 * Ejercicio 11:  Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
 * Estos los guardaremos en una tabla de tamaño 10. 
 * Leer un numero N, e insertarlo en el lugar adecuado para que la tabla continue ordenada. 
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int [10];
		boolean creciente = true;
		int numero, sitio_num=0,j=0;
		
		System.out.println("Rellernar el Array");
		do {
			//llenando el array
			for(int i = 0; i<5;i++) {
				System.out.println((i+1)+". Introduzca un numero");
				arreglo[i] = entrada.nextInt();
			}
			// comprobar que el array esta ordenado de forma creciente
			for(int i=0; i<4;i++) {
				if (arreglo[i]<arreglo[i+1]) {//Creciente: 1-2-3
					creciente = true;
				}
				if(arreglo[i]>arreglo[i+1]) {//Decreciente: 3-2-1
					creciente = false;
					break;
				}
			}
			
			if (creciente == false) {
				System.out.println("\nEl Array no esta ordenado de forma creciente , vuelva a introducir los digitos\n");
			}
		}while(creciente == false);
		
		System.out.println("\nIntroduzca un elemento a insertar");
		numero = entrada.nextInt();
		
		//Esto es para darnos cuenta en que posicion va el numero
		while(arreglo[j]<numero && j<5) {
			sitio_num++;
			j++;
		}
		
		//Trasladamos una posicion en el arreglo a los elementos que van detras del numero
		for(int i=4;i>=sitio_num; i--) {
			arreglo[i+1] = arreglo[i];
		}
		// insertamos el numero que el usuario puso
		arreglo[sitio_num] = numero;
		
		
		System.out.println("\nEl arreglo queda: ");
		for(int i=0;i<6;i++) {
			System.out.println(arreglo[i]+" - ");
		}
		System.out.println();
	}

}
