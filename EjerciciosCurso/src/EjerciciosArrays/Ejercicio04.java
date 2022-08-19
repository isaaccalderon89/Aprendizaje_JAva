/*
 * Ejercicio 4:  Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden: 
 * el primero, el ultimo, el segundo, el penultimo, el tercero, etc.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int numeros[]= new int[10]; // Array con 10 elementos
		
		//pedimos el Array
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+". Introduzca un numero: ");
			numeros[i]=entrada.nextInt();
		}
		System.out.println("El resultado es : ");
		for(int i = 0;i<5;i++) {
			System.out.println(numeros[i]+" ");//primer
			System.out.println(numeros[i]+" ");// el ultimo
		}
		System.out.println();
	}

}
