
public class TipoBoolean {

	public static void main(String[] args) {
		
		boolean varBoolean = true;
		
		System.out.println("varBoolean = "+ varBoolean);
		
		if (varBoolean) {
			System.out.println("La bandera es verdadera");
		}

		else {
			System.out.println("la bandera es falsa");
		}
		
		var edad = 30;
		var esAdulto= edad>=18;
		if(esAdulto) {
			System.out.println("es maypr de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
		
	}
	
	

}
