package pe.gob.cenepred.laboratorio2.poo;

public class Canino extends Animal{

	
	
	
	//declaracion de un constructor personizalizado 
	public Canino(String figura, String comida, boolean hambre, int limites, String ubicacion) {
		super(figura, comida, hambre, limites, ubicacion);
		// TODO Auto-generated constructor stub
	}
	
	//declaracion de metodos de instancia
	public void caminar() {
		
		System.out.println("caminando con canino");
	}

}
