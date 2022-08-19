package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
        int numero1, numero2;

        

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Proporciona un numero : "));

        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Proporciona otro numero : "));



        if ((numero1 %2 ==0) && (numero2 %2 ==0)){

                      JOptionPane.showMessageDialog(null, "Ambos numeros son pares");

        }

        else if ((numero1 %2 !=0) && (numero2 %2 !=0)){

                      JOptionPane.showMessageDialog(null, "Ambos numeros son impares");

        }

        else{

                      JOptionPane.showMessageDialog(null, "Uno es par y el otro es impar");

        }

    }
}

