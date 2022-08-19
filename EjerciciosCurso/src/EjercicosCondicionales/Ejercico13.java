package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercico13 {

	public static void main(String[] args) {
		final int saldoInicial = 1000;
		int opcion;
		float ingreso, saldoActual, retiro;
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cajero Automático\n"
				+ "1. Ingresar dinero en la cuenta\n"
				+ "2. Retirar dinero de la cuenta\n"
				+ "3. Salir"));
		
		switch (opcion) {
		case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad que desea ingresar"));
				saldoActual = saldoInicial + ingreso;
				JOptionPane.showMessageDialog(null, "Dinero en cuenta : "+saldoActual);
				break;
		case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad que desea retirar"));

				if (retiro > saldoInicial) {
					JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente");
				}
				else {
					saldoActual = saldoInicial - retiro;
					JOptionPane.showMessageDialog(null, "Dinero en cuenta : "+saldoActual);
					
				}
				break;
		case 3: break;
		default : JOptionPane.showMessageDialog(null, "Opción incorrecta");
		
		}

	}

}
