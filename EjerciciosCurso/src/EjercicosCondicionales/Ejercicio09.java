package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio09 {

	public static void main(String[] args) {
        int dia, mes, año;

        

        dia = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el dia : "));

        mes = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el mes : "));

        año = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el año : "));



        if ((dia >= 1) && (dia <= 7)){ //comprobamos dia

                      if((mes >=1) && (mes <=12)){// comprobamos mess

                                     if(año != 0 ){ // comprobamos año

                                                    JOptionPane.showMessageDialog(null, "Fecha correcta: " +dia+ "-"+mes+"-"+año+);



                                     }

                                     else{

                                                    JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");



                                    

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
