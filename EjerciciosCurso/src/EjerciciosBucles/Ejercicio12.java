package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		int numero;
		long factorial = 1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		
		for ( int i=1; i<=numero; i++) {
			factorial *=i; //Multiplicacion iterativa
		}
		
		System.out.println("El factorial de este numero "+numero+" es: "+factorial);
	}

}
