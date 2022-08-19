package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int numero; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Proporciona un numero : "));
		
		if (numero%10 == 0){
			JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
		}
		else {
			JOptionPane.showConfirmDialog(null, "El numero no es multiplo de 10");
		}

	}

}
