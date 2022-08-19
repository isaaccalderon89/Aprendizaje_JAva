import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenamientoSeleccion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int arreglo[],nElementos, min, aux;
		
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de elementos que tendrá el arreglo"));
		
		arreglo = new int[nElementos];
		
		System.out.println("Rellenando el Array: ");
		for( int i=0;i<nElementos;i++) {
			System.out.print((i+1)+". Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		//Ordenamiento por Seleccion
		for(int i=0;i<nElementos;i++) {
			min = i;
			for(int j = i+1; j<nElementos;j++) {
				if(arreglo[j] < arreglo[min]) {
					min = j; 
				}
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[min];
			arreglo[min] = aux;
			
		}
		
		System.out.print("\nOrden Creciente: ");
		for(int i=0; i<nElementos;i++) {
			System.out.print(arreglo[i]+ " - ");
		}

		System.out.println("");
		
		System.out.print("\nOrden Decreciente: ");
		for(int i = (nElementos-1);i>=0;i--) {
			System.out.println(arreglo[i]+" - ");
		}
		System.out.println("");
	}

}
