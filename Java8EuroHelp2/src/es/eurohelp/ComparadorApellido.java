package es.eurohelp;

import java.util.Comparator;

public class ComparadorApellido  implements Comparator<Persona>{

	// cada vez que realizamos una comparación que no es por el campo
	// principal que la clase implementa 
	@Override
	public int compare(Persona persona1, Persona persona2) {
		
		return persona1.getApellidos().compareTo(persona2.getApellidos());
	}

}
