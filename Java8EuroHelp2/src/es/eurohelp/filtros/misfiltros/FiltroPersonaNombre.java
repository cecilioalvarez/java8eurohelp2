package es.eurohelp.filtros.misfiltros;

import es.eurohelp.intro.Persona;

public class FiltroPersonaNombre implements FiltroPersona {

	private String nombre;

	public FiltroPersonaNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public boolean test(Persona persona) {
		// TODO Auto-generated method stub
		if (persona.getNombre().equals(nombre)) {
			return true;
		} else {
			return false;
		}
	}

}
