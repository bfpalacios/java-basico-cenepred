package pe.gob.cenepred.laboratorio2.poo;

public class TetsAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear el objeto animal
		Animal animal = new Animal();
		
		
		animal.caminar();
		
		Canino canino = new Canino(null, null, false, 0, null);
		
		canino.caminar();

	}

}
