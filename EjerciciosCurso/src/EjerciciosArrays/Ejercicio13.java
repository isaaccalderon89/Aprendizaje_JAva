/*
 * Ejercicio 13:  Leer 10 enteros en una tabla. 
 * Guardar en otra tabla los elementos pares de la primera, 
 * y a continuación los elementos impares.   
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int [10];//Creamos el array para 10 elementos enteros
		int contador_pares=0, contador_impares=0;
		
		System.out.println("Rellenamos el array");
		for(int i=0 ; i<10; i++) {
			System.out.println((i+1)+". Digite un numero: ");
			arreglo[1] = entrada.nextInt();
			
			if(arreglo[1] % 2==0) {//si el numero es par
				contador_pares++;
			}
			else {//si el numero es impar
				contador_impares++;
			}
		}
		
		//Crear los arreglos siguientes
		int par[] = new int[contador_pares];//Creamos el arreglo para almacenar los numeros pares
		int impar[] = new int [contador_impares];// Creamos el arreglo de los numeros impares
		
		contador_pares=0;
		contador_impares=0;
		
		for(int i = 0; i<10; i++) {
			if(arreglo[i] % 2 == 0) {
				par[contador_pares] = arreglo[i];
				contador_pares++;
			}
			else {
				impar[contador_impares] = arreglo[i];
				contador_impares++;
			}
		}
		
		System.out.println("\nArreglo pares : ");
		for(int i = 0; i<contador_pares;i++) {
			System.out.println(par[i]+ " - ");
		}
		System.out.println("");
		
		System.out.println("\nArreglo impares: ");
		for(int i=0; i<contador_impares;i++) {
			System.out.println(impar[i]+" - ");
		}
		System.out.println("");
	}

}
