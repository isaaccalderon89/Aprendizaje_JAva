package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		float precioCompra, descuento; 
		
		precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio de compra"));
		
		if (precioCompra > 300) {
			descuento = precioCompra * 0.20f;
			precioCompra -= descuento;
			JOptionPane.showMessageDialog(null, "El precio de compra es: "+precioCompra);
		}
		else {
			JOptionPane.showMessageDialog(null, "El precio de compra es: "+precioCompra);
		}
	}

}
