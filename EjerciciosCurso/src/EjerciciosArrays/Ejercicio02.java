/*
 * Ejercicio 2:  Leer 5 numeros guardarlos en un arreglo y mostrarlos en el orden inverso al introducido.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 float numeros[]=new float [5];
		 
		 System.out.println("Guardadno los datos del arreglo");
		 for(int i=0;i<5;i++) {
			 System.out.println((i+1)+". Introduzca un numero");
			 numeros [i]= entrada.nextFloat();
		 }
		 
		 System.out.println("\nLos elementos del arreglo en orden inverso son:  ");
		 for(int i=4;i>=0;i--) {
			 System.out.println(numeros[i]);
		 }

	}

}
