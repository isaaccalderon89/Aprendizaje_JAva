package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		int numero, cuadrado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		
		while(numero >=0) {// mientras el numero sea 0 o positivo
			cuadrado = (int)Math.pow(numero,2);// se le dice que el resultado double lo transforme a un entero
			
			JOptionPane.showMessageDialog(null, "El numero : "+numero+" elevado al cuadrado es: "+cuadrado);
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		}

	}

}
