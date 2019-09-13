package pe.gob.cenepred.laboratorio2.poo;

public class Animal {

	// definir las variables de instancia
	private String figura;
	private String comida;
	private boolean hambre; // true: tiene hambre, false: no tiene hambre
	private int limites;
	private String ubicacion;

	// definir el constryctor personalizado
	// constructor por default
	public Animal() {
	}

	public Animal(String figura, String comida, boolean hambre, int limites, String ubicacion) {
		super();
		this.figura = figura;
		this.comida = comida;
		this.hambre = hambre;
		this.limites = limites;
		this.ubicacion = ubicacion;
	};

	// definir los metodos de instancia
	public void hacerRuido() {

		System.out.println("Haciendo ruido");
	}

	public void comer() {

		System.out.println("Comiendo");
	}

	public void dormir() {

		System.out.println("Durmiendo");
	}

	public void caminar() {

		System.out.println("Caminando");
	}

}
