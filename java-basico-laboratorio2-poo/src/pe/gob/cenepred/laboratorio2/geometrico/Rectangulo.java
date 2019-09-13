package pe.gob.cenepred.laboratorio2.geometrico;

public class Rectangulo extends Figura{
	
	
	//variables de instancia
	private int w,h;
	
	
	//super(x, y); misma equivalencia
	public Rectangulo(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(int x, int y, int w, int h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (w*h);
	}
	
	
	 

}
