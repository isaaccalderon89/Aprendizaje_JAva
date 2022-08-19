package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio21 {

	public static void main(String[] args) {
		int numero;
		boolean hay_negativos = false;
		
	
		for(int i=1; i<=10;i++) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce 10 numeros: "));
			
			
			if( numero < 0) {//si el numero es negativo
				hay_negativos = true;
			}
			
		}
		
			if (hay_negativos == true) {
				System.out.println("Si existe un numero negativo");
			}
			else {
				System.out.println("No existe ningún numero negativo");
			}
	}

}
