/*
 * Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
 */

package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float numero[] = new float[5];
		
		System.out.println("Guardando los datos en el arreglo");
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+". Digite un numero");
			numero[i] = entrada.nextFloat();
		}
		System.out.println("\nImprimir los elementos del arreglo");
		for(float i: numero) {
			System.out.println(i);
		}

	}

}
