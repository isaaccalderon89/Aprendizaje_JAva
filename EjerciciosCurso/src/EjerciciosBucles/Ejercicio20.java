package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		int numeroSueldos;
		float sueldo, sueldo_max=0;
		
		numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos que  quieres intorducir"));
		
		for(int i = 1; i<=numeroSueldos;i++) {
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo Nº"+i+": "));
			
			if (sueldo > sueldo_max) {
				sueldo_max=sueldo;
			}
		}
		
		System.out.println("El sueldo máximo es: "+sueldo_max);

	}

}
