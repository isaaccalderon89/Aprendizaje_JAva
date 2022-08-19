import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		int arreglo[], nElementos,aux;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Intorduce la cantidad de elementos del array"));
		arreglo = new int[nElementos]; // Le asignamos el numero de elementos al arreglo
		
		for(int i = 0; i<nElementos; i++) {
			System.out.print((i+1)+". Digiten un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		//Metodo burbuja 
		for(int i = 0; i<(nElementos-1); i++) {
			for (int j=0; j<(nElementos-1);j++) {
				if (arreglo[j] > arreglo[j+1]) {//si numeroActual > numeroSiguiente
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		
		//Mostrando el arreglo en forma creciente 
		for(int i=0; i<nElementos;i++) {
			System.out.print(arreglo[i]+" - ");
		}
		
		System.out.println("\nArray ordenado en forma decreciente");
		for( int i = (nElementos-1); i>=0;i--) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println(" ");
	}

}
