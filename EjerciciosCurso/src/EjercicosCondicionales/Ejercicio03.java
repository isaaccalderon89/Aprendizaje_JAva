package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		char letra; 
		
		letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
		
		if(Character.isUpperCase(letra)) {
			JOptionPane.showConfirmDialog(null, "Es una letra mayuscula");
		}
		else {
			JOptionPane.showConfirmDialog(null, "Es una letra minuscula");
		}
	}

}
