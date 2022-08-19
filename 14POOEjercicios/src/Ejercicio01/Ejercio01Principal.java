
/*
 * no funciona el codigo, revisarlo 
 */

package Ejercicio01;

import javax.swing.JOptionPane;

public class Ejercio01Principal {

	public static void main(String[] args) {
		Ejercicio01 c1;
		float lado1,lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1; "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2; "));
		
		if(lado1 == lado2) {
			c1 = new Ejercicio01(lado1);
		}
		else {
			c1 = new Ejercicio01(lado1, lado2);
				
			}
		System.out.println("El perimetro es: "+c1.getPerimetro());
		System.out.println("El area es: "+c1.getArea());
		}

	}


