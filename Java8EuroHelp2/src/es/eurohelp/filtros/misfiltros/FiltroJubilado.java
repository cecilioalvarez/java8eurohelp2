package es.eurohelp.filtros.misfiltros;

import es.eurohelp.intro.Persona;

public class FiltroJubilado implements FiltroPersona {

	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		return persona.getEdad()>=65;
	}

}
