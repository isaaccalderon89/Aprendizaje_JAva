package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero, contador = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		
		while (numero>=0) {//mientras numero no sea negativo
			contador++;
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		}
		
		System.out.println("Ha introducido "+contador+" no negativos");

	}

}
