package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero : "));
		
		while (numero !=0) {
			if (numero % 2 ==0){
				System.out.println("El numero "+numero+" es PAR");
			}
			else {
				System.out.println("El numero "+numero+" es IMPAR");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero : "));
		}

	}

}
