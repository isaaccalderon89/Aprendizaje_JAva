package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio09 {

	public static void main(String[] args) {
        int dia, mes, a�o;

        

        dia = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el dia : "));

        mes = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el mes : "));

        a�o = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el a�o : "));



        if ((dia >= 1) && (dia <= 7)){ //comprobamos dia

                      if((mes >=1) && (mes <=12)){// comprobamos mess

                                     if(a�o != 0 ){ // comprobamos a�o

                                                    JOptionPane.showMessageDialog(null, "Fecha correcta: " +dia+ "-"+mes+"-"+a�o+);



                                     }

                                     else{

                                                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, a�o incorrecto");



                                    

                      }

                      else{

                                     JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");

       

        }

        else {

                      JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto ");
        }
                 
                      }


	}

}
