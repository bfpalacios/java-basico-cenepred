package pe.gob.cenepred.laboratorio2.geometrico;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura[] fgs = { new Rectangulo(56, 78, 3, 4), new Rectangulo(12, 34, 5, 7) };
		
		
		System.out.println("Area " + 1 + ": " + fgs[0].getArea());
		System.out.println("Posicion X: " + fgs[0].getX());
		System.out.println("Posicion Y: " + fgs[0].getY());
		System.out.println("Area " + 2 + ": " + fgs[1].getArea());
		System.out.println("Posicion X: " + fgs[1].getX());
		System.out.println("Posicion Y: " + fgs[1].getY());

	}

}
