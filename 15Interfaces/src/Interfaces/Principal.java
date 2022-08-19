package Interfaces;

public class Principal {

	public static void main(String[] args) {
		MusicoEstudiante musicoE = new MusicoEstudiante();
		
		musicoE.hablar();
		musicoE.estudiar();
		musicoE.tocarMusica();
/*
 * Recuerda que una interfaces tiene todos sun metodos atractos y todos sus atributos final.
 */
	}

}
