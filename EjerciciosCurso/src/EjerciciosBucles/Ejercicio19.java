package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		float nota;
		int aprobados=0, condicionados=0, suspensos=0;
		
		for(int i=1;i<=6;i++) {
			do {
				nota = Float.parseFloat(JOptionPane.showInputDialog("Introduzca una nota: "));
				
			}while(nota<0 || nota>10);
			
			if (nota == 4 ) {
				condicionados++;
			}
			else if (nota<=5) {
				aprobados++;
			}
			else {
				suspensos++;
			}
		}
		System.out.println("Cantidad de aprobados: "+aprobados);
		System.out.println("Cantidad de condicionados: "+condicionados);
		System.out.println("Cantidad de suspensos: "+suspensos);
		
		
	}

}
