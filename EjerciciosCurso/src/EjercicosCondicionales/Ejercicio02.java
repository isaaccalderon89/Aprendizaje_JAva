package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero1 , numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Proporciona un numero : "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Proporciona otro numero : "));
		
		if (numero1 > numero2) {
			JOptionPane.showConfirmDialog(null, "El numero mayor es : "+numero1);
		}
		else if (numero2 > numero1) {
			JOptionPane.showConfirmDialog(null, "El numero mayor es : "+numero2);
		}
		else {
			JOptionPane.showConfirmDialog(null, "Ambos numeros son iguales");
		}
	}

}
