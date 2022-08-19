import javax.swing.JOptionPane;

public class SentenciaIf {

	public static void main(String[] args) {
		/*
		 * La sentencia if: 
		 * 	
		 * 	if(condicion){
		 * 		Instruccion1;
		 * }
		 * else{
		 * 		Instruccion2;
		 * }
		 */

		int numero, dato = 5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		if (numero == dato) { // el operador de desilgualdad es de la siguiente manera: "!="
			JOptionPane.showMessageDialog(null, "El numero es 5");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
		}
	}
		/*
		 * == : Igualdad
		 * != : Diferencia
		 * 	> : Mayor 
		 * >= : Mayor o igual 
		 * <  : Menor
		 * <= : Menor o igual
		 */
}
