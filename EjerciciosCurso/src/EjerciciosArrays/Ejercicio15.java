/*
 * Ejercicio 15:  Leer dos series de 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla.
 * Se debe mostrar la posición en que se encuentra. Si no está, indicarlo en el mensaje.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[], numero;
		boolean creciente = true;
		
		arreglo = new int[10];//Creamos el arreglo con 10 posiciones
		
		do {
			//Pedimos el arreglo 
			System.out.println("rellene el arreglo: ");
			for(int i = 0; i<10;i++) {
				System.out.print(i+". digite un numero: ");
				arreglo[i] = entrada.nextInt();
			}
			// verificar si el arreglo está ordeanado
			for(int i=0;i<9;i++) {
				if(arreglo[i] < arreglo[i+1]) {//creciente:
					creciente = true;
				}
				
				if(arreglo[i] > arreglo[i+1]) {//decreciente
					creciente = false;
					break;
				}
			}
			
			if (creciente == false) {
				System.out.println("\nEl arreglo está desordenado, digite nuevamente: \n");
			}
		} while(creciente == false);
		
		//Pedimos el numero a buscar
		System.out.println("\nDigite el numero a buscar en el arreglo. ");
		numero = entrada.nextInt();
		
		//buscamos el numero en el arreglo
		int i=0; 
		while(i<10 && arreglo[i] <numero) {
			i++;
		}
		
		if(i==10) {//Hemos recorrido todo el arreglo y no encontramos nada
			System.out.println("\nNumero no encontrado");
		}
		else {
			if(arreglo[i] == numero) {
				System.out.println("\nNumero encontrado, en la posicion:  "+i);
			}
			else {
				System.out.println("\nNumero no encontrado");
			}
		}

	}

}
