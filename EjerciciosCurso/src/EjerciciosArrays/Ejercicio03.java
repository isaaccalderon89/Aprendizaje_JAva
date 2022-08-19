/*
 * Ejercicio 3:  Leer 5 numeros por teclado, almacenarlos en un arreglo 
 * y a continuación realizar la media de los números positivos, 
 * la media de los negativos y contar el numero de ceros.
 */

package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float numeros[]=new float[5];
		float suma_positivos=0, suma_negativos=0, mediaNegativos, mediaPositivos;
		int contador_positivos=0, contador_negativos=0, contador_ceros=0;
		
		System.out.println("Guardando los numeros en el arreglo");
		for(int i = 0 ;i<5;i++) {
			System.out.println((i+1)+". Introduzca numero: ");
			numeros[i]=entrada.nextFloat();
			
			if (numeros[i]==0) {
				contador_ceros++;
			}
			else if(numeros[i]>0) {
				suma_positivos+=numeros[i];
				contador_positivos++;
			}
			else {
				suma_negativos+=numeros[i];
				contador_negativos++;
			}
		}
		//Media de los numeros positivos
		if (contador_positivos==0) {
			System.out.println("no se puede sacar la media de los numeros positivos");
		}
		else {
			mediaPositivos= suma_positivos / contador_positivos;
			System.out.println("La media de los numeros positivos es:  "+mediaPositivos);
		}
		//Media de los numeros negtivos
		if(contador_negativos==0) {
			System.out.println("No se puede sacar la media de los numeros negativos");
		}
		else {
			mediaNegativos = suma_negativos / contador_negativos;
			System.out.println("La media de los numeros negativos es:  "+mediaNegativos);
		}
		System.out.println("La cantidad de ceros es: "+contador_ceros);
	}

}
