package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		float nota;
		boolean hay_suspensos = false;
		
		for(int i = 1; i<=5;i++) {
			do {
				nota = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota entre 0-10: "));
			}while(nota<=0 || nota >=10);
			
			if(nota < 5 ) {
				hay_suspensos = true;
			}
		}
		if(hay_suspensos == true) {
			System.out.println("Si existe alumnos suspensos");
		}
		else {
			System.out.println("No hay alumnos suspensos");
		}

	}

}
