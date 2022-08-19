package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		int numero; 
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 10: "));
		} while(numero<0 || numero>10);
		
		System.out.println("La tabla de multiplicar del numero "+numero+" es: ");
		
		for(int i=1; i<=12;i++) {
			System.out.println(numero+" * "+i+" = "+numero*i);
		}

	}

}
