package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		int numero, suma=0; 
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			
			suma += numero; 
		}while(numero !=0);
		
		System.out.println("La suma es "+suma);

	}

}
