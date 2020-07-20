package es.eurohelp.filtros.misfiltros;

import es.eurohelp.intro.Persona;

public class FiltrosFavoritos {

	// una misma clase podria tener varios filtros 
	
	public static boolean estaJubilado(Persona persona) {
		
			return persona.getEdad()>=65;
	}
	
	public static boolean esMenorEdad(Persona persona) {
		
		return persona.getEdad()<=18;
}
}
