package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	public static void main(String[] args) {
		int numero, i;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		
		i = 1;
		
		while(i <= numero) {
			System.out.println(i);
			i++;
		}

	}

}
