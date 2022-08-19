package EjerciciosBucles;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numero,aleatorio, contador = 0; 
		
		
		aleatorio =(int) (Math.random()*100);//generar un numero aleatorio entre 0-100
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			
			if(aleatorio >numero) {
				System.out.println("Digite un numero mayor");
			}
			else {
				System.out.println("Digite un numero menor");
			}
			contador++;
		} while(numero != aleatorio);
		
		System.out.println("\n ADIVINASTE EL NUMERO EN "+contador+" INTENTOS");

	}

}
