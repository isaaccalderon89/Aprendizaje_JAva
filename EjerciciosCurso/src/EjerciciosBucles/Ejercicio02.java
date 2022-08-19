package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		
			while (numero!=0) {//mientras el numero sea doferente de 0
				if (numero > 0 ) {
					System.out.println("El numero "+numero+" es positivo");
				}
				else {
					System.out.println("El numero "+numero+" es negativo");
				}
				numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			}	

	}

}
