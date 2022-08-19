/*
 * Ejercicio 5:  Leer por teclado dos tablas de 10 numeros enteros y 
 * mezclarlas en una tercera de la forma : el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 */
package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int a[], b[], c[];
		
		a = new int[10]; // Arreglo a con 10 elementos
		b = new int[10]; // Arreglo b con 10 elementos
		c = new int[20]; // Arreglo c contendra el arreglo a y b
		
		// pediomos el arreglo a  
		System.out.println("Introduzca el primer arrglo");
		for(int i = 0; i<10;i++) {
			System.out.print((i+1)+". Introduzca un numero");
			a[i]= entrada.nextInt();
		}
		
		//Pedimos el arreglo b
		System.out.println("\nIntroduzca el segundo arreglo: ");
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+". Introduzca un numero: ");
			b[i] = entrada.nextInt();
		}
		//Ahora mezaclamos los dos arrays en el array C
		// vamos a utilizar el iterador i para a y b
		// y el iterador j para el arreglo c
		
		int j = 0;
		for(int i = 0;i<10;i++) {
			c[j]=a[i];//1ºA
			j++;
			c[j]= b[i];//1ºB
			j++;
		}
		System.out.println("\nEl tercer array es: ");
		for(int i = 0; i<20;i++) {
			System.out.println(c[i]+" ");
		}

	}

}
