package pe.gob.cenepred.laboratorio2.geometrico;

public abstract  class Figura {

	// variables de instancias
	private int x, y;

	//definir un constructor personalizado
	public Figura(int x, int y) {

		this.x = x;
		this.y = y;
	}
	
	//definir los metodos de instancia
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract double getArea();
	/*
	 * cada figura debería tener un método getArea() para obtener el area de la
	 * figura
	 */

}
