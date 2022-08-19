package EjercicosCondicionales;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
        int dia, mes, año;

        

        dia = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el dia : "));

        mes = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el mes : "));

        año = Integer.parseInt(JOptionPane.showInputDialog("Proporciona el año : "));

       

        if (año == 0){

                      JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");



        }

        else if ((mes == 2) && (dia>1 && dia<=28)

                      JOptionPane.showMessageDialog(null, "La fecha es correcta");

        }

        else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>=1 && dia<=30)

                      JOptionPane.showMessageDialog(null, "La fecha es correcta");

        }

        else if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)                                    

                      JOptionPane.showMessageDialog(null, "La fecha es correcta");

        }

        else{

                      JOptionPane.showMessageDialog(null, "La fecha es incorrecta");

        }

	}

}
