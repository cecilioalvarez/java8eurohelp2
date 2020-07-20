package es.eurohelp.filtros.misfiltros;

import es.eurohelp.intro.Persona;

public interface FiltroPersona {

	// testea si una persona cumple la condicion
	//de filtrado o no la cumple
	
	//unicamente dispone de un método concreto
	// metodo abstracto 
	// un metodo que no tiene implementación
	
	public boolean test(Persona persona);
	
	//default methods
	// static methods
}
