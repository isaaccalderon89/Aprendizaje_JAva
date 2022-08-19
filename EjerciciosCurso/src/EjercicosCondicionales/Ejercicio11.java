package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		int numero1, numero2, suma, resta, multi, div;
		char operacion;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Proporciona un numero : "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Proporciona un numero : "));
		
		operacion = JOptionPane.showInputDialog("Indique la operaciona a realizar : ").charAt(0);
		
		switch (operacion) {
		
		case 's':
		case 'S': suma = numero1 + numero2;
					JOptionPane.showMessageDialog(null, "La suma es : "+suma);
					break;
		case 'r':
		case 'R': resta = numero1 - numero2;
					JOptionPane.showMessageDialog(null, "La resta es : "+resta);
					break;
		case 'p':
		case 'P':
		case 'm':
		case 'M': multi = numero1 * numero2;
					JOptionPane.showMessageDialog(null, "La multiplicacion es : "+multi);
					break;
		case 'd':
		case 'D': div = numero1 + numero2;
					JOptionPane.showMessageDialog(null, "La division es : "+div);
					break;
		default: JOptionPane.showMessageDialog(null, "Erro al introdicir la operacion"); break;
					
					
					
					
		}
		

	}

}
