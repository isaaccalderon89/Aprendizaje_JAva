package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		int numero, suma= 0;
		
		for (int i = 1; i<=10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("DIgite un numero: "));
			
			suma +=numero;
		}
		System.out.println("La suma es: "+suma);

	}

}
