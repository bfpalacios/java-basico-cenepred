package pe.gob.cenepred.laboratorio2.interfacesimpl;

import pe.gob.cenepred.laboratorio2.interfaces.Capitalizable;

public class TetsOracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Capitalizable[] obj1 = new Capitalizable[3];
		
		obj1[0] = new Palabra("Programacion en Java");
		obj1[1] = new Palabra("Ceups");
		obj1[2] = new Oracion("Curso Java Basico - Ceups");
		
		//iterar dentro del array creado obj1
		for (int i = 0; i < obj1.length; i++) {
			System.out.println("Texto " + i + ": " + obj1[i].cambiaMinuscula());
		}
	}

	
	 
	
}
