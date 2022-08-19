import javax.swing.JOptionPane;

public class Operadorternario {

	public static void main(String[] args) {
		int numero;
		String mensaje;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Proporcione un numero: "));
		
		mensaje = (numero%2 == 0) ? "Es par" : "Es impar";
		
		JOptionPane.showMessageDialog(null,mensaje);

	}

}
