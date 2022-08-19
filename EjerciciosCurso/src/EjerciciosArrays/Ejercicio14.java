/*
 * Ejercicio 14:  Leer dos series de 10 enteros, que estarán ordenados crecientemente.
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.   
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		int a[], b[], c[];
		boolean creciente = true;
		
		a = new int [10];// 10 elementos para el arreglo a
		b = new int [10];// 10 tambien para el arreglo b
		c = new int [20];// 20 elementos para el arreglo c
		
		System.out.println("Digite el primer array: ");
		do {
			//pedimos el array
			for(int i=0;i<10;i++) {
				System.out.print((i+1)+". Digite un numero: ");
				a[i] = entrada.nextInt();
			}
			//comprobamos si el arreglo esta ordenado 
			for(int i = 0;i<10;i++) {
				if(a[i] <a[i+1]) {
					creciente = true;//Creciente
				}
				if (a[i] > a[i+1]) {
					creciente = false;//Decreciente
					break;
				}
				
			}
			if (creciente ==false) {
				System.out.print("\nEl arreglo esta desordenado, vuelva a digitar: ");
			}
			
			
		}while(creciente == false);
		
		System.out.println("Digite el segundo array: ");
		do {
			//pedimos el array
			for(int i=0;i<10;i++) {
				System.out.print((i+1)+". Digite un numero: ");
				b[i] = entrada.nextInt();
			}
			//comprobamos si el arreglo esta ordenado 
			for(int i = 0;i<10;i++) {
				if(b[i] <b[i+1]) {
					creciente = true;//Creciente
				}
				if (b[i] > b[i+1]) {
					creciente = false;//Decreciente
					break;
				}
				
			}
			if (creciente ==false) {
				System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
			}
			
			
		}while(creciente == false);
		
		int i=0; // Iterador sera para el arreglo a
		int j=0; // Iterador sera para el arreglo b
		int k=0; // Iterador sera para el arreglo c
		
		while ( i<10 && j<10) {
			if(a[i] < b[j]) {//si el elemento del a en menor del elemento b
				c[k] = a [i];//copiamos el elemento de a
				i++;//avanzamos una posicion en a
			}
			else {
				c[k] = b[j]; // copiamos el elemento de b
				j++;//Avanzamos una posicion mas en b
			}
			k++;// Avanzamos una posicion en c 
		}
		//Cuando salimos del while es porque un arreglo (a o b), se a copiado completamente
		if(i==10) {//Significa que ya copiamos tpdp el arreglo a, falta el b
			while(j<10) {//mientras el iterador sea menor a 10
				c[k] = b[j];//copiamos el elemento de b en c
				j++;//Avanzamos una posicion en b
				k++;//Avanzamos una posicion en c
			}
			
		}
		else {//Significa que ya copiamos todo el arreglo b, falta el a
			while(j<10) {
				c[k] = a[i];
				i++;
				k++;
			}
		}
		
		System.out.println("\nEl arreglo C completo es: ");
		for(k=0;k<20;k++) {
			System.out.println(c[k]+" - ");
		}
		System.out.println("");
	}

}
