package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
		int numero, suma=0, elementos = 0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		
		while(numero>=0) {
			suma +=numero;
			elementos++;//Aumentamos una a elementos
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));	
		}
		
		if (elementos == 0) {
			System.out.println("ERROR! La division entre 0 no existe");
			
		}
		else {
			media = (float) suma/elementos; 
			System.out.println("La media es: "+media);
		}

	}

}
