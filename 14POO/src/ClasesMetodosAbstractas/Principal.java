package ClasesMetodosAbstractas;

public class Principal {

	public static void main(String[] args) {
		//SerVivo servivo =  new SerVivo(); no permite crear el objeto por ser abstracta
		Planta planta = new Planta();
		AnimalCarnivoro animalC = new AnimalCarnivoro();
		
		planta.alimentarse();
		animalC.alimentarse();

	}

}
