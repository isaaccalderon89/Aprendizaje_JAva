import java.util.Scanner;

import javax.swing.JOptionPane;

public class RellenarArrays {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nElementos; 
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del Array"));
		
		char[] letras = new char[nElementos];
		
		System.out.println("Digite los elementos del arreglo: ");
		for (int i=0;i<nElementos;i++) {
			System.out.println((i+1)+" Digite un caracter: ");
			letras[i] = entrada.next().charAt(0);
		}
		System.out.println("\nLos caracteres del arreglo son: ");
		for(int i=0;i<nElementos;i++) {
			System.out.println(letras[i]);
		}
	}

}
