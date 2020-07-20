package es.eurohelp.filtros.misfiltros2;

import java.util.function.Predicate;

import es.eurohelp.intro.Persona;

public class FiltroJubilado implements Predicate<Persona>{

	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		return persona.getEdad()>=65;
	}

}
