package pe.gob.cenepred.laboratorio2.interfacesimpl;

import pe.gob.cenepred.laboratorio2.interfaces.Capitalizable;

public class Palabra implements Capitalizable {
	
	private String texto;

	Palabra(String n) {
		texto = n.replaceAll(" ", "");
	}

	// metodos de Interfase
	public String cambiaMayuscula() {
		return texto.toUpperCase();
	}

	public String cambiaMinuscula() {
		return texto.toLowerCase();
	}

}
