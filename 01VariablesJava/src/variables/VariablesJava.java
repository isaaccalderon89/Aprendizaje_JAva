package variables;
// Mi clase en java

public class VariablesJava {

	public static void main(String[] args) {
		//definimos una variable
		
		int miVariableEntera = 10; // lowerCamelCase
		System.out.println("El pirmer valor que asignamos a la variables :"
				 + miVariableEntera);
		
		System.out.println("************************");
		
		/*
		 * La ventaja de las variables es que se pueden reutilizar  a lo largo del programa
		 *  Una vez que la variable es definida anteriormente no hace falta que se vuelva a 
		 * definir, en este caso solo estamos modificando.
		 */
		
		miVariableEntera = 5;
		System.out.println("Estamos reutilizando la variable :"+miVariableEntera);
		
		System.out.println("************************");
		
		String miVariableCadena = "Saludos";
		System.out.println(miVariableCadena);
		
		System.out.println("************************");
		//reutilizamos la variable tipo String
		
		miVariableCadena = "Adios";
		System.out.println(miVariableCadena);
		// Si hacemos control + click en la variable nos lleva donde se definió la variable
		
		System.out.println("************************");	
		
		// var - Inferencia de tipos en Java
		
		var miVariableEntera2 = 15;
		System.out.println(miVariableEntera2);
		
		System.out.println("************************");
		
		var miVariableCadena2 = "Nueva cadena con var";
		System.out.println(miVariableCadena2);
		
		/*
		 * segun las convenciones Java una variable debe definirse con el formato
		 * lowerCamelCase, no permite caracteres especiales salvo alguna excepcion
		 * 
		 *  var miVariable = 1;
		 *  var _miVariable = 2;
		 *  var $mivariable = 3;
		 *  	
		 */
	
		

	}

}
