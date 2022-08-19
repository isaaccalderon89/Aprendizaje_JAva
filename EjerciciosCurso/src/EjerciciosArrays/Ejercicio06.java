/*
 * Ejercicio 6:  Leer los datos correspondiente a dos tablas de 12 elementos numéricos, 
 * y mezclarlos en una tercera de la forma: 
 * 3 de la tabla A, 3 de la tabla B, otros 3 de tabla A, otros 3 de la B, etc.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[], b[],c[];
		int i, j ; 
		
		a = new int[12]; // arreglo a [] va a tener 12 elementos
		b = new int[12];
		c = new int[24]; // Arreglo c[] va a almacenar 24 elementos
		
		//Pedimos el arreglo a[]
		
		System.out.println("Forme el  primer arreglo");
		for( i = 0; i<12;i++) {
			System.out.print((i+1)+". Introduzca un numero");
			a[i] = entrada.nextInt();
		}
		
		// pedimos el arreglo b[]
		System.out.println("Forme el  segundo arreglo");
		for(i = 0; i<12;i++) {
			System.out.print((i+1)+". Introduzca un numero");
			b[i] = entrada.nextInt();
		}
		
		//Ahora vamos a mezclar los dos Arrays a[] y b[]
		// El iterador i sera para los arrglos a[] y b[]
		// El iterador j sera para el arreglo c[]
		
		i = 0;
		j = 0;
		
		while (i<12){
			//copiar los tres elementos de a[]
			for(int k=0;k<3;k++) {
				c[j] = a [i+k];
				j++;
			}
			// Copiamos tres elementos del array b[]
			for(int k=0;k<3;k++) {
				c[j] = b [i+k];
				j++;
			}
			
			i+=3;
		}
		System.out.println("El array resultante es: ");
		for(i=0;i<24;i++) {
			System.out.print(c[i]+" - ");
		}
		System.out.println();
	}

}
