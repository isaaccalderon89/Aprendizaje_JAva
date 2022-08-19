package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
        int horasTrabajadas;

        float salarioTotal;



        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Proporciona las horas trabajadas: "));

       

        if(horasTrabajadas <= 40){

                      salarioTotal = horasTrabajadas * 16;

        }

        else{

                      salarioTotal = (40*16) + (horasTrabajadas - 40) * 20;

        }



        JOptionPane.showMessageDialog(null, "El salario total es: "+salarioTotal);

	}

}
