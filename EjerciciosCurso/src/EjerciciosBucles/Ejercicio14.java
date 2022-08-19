package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		float sueldo, suma=0;
		int contador=0;
		
		for(int i=1; i<=10;i++) {
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un sueldo: "));
			
			if (sueldo >1000) {
				contador++;
			}
			suma +=sueldo;
		}
		System.out.println("La suma de todos los sueldos es: "+suma);
		System.out.println("La cantidad de sueldos mayores a 1000: "+contador);
	}

}
