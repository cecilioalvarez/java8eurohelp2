package es.eurohelp.filtros.misfiltros2;

import java.util.function.Predicate;

import es.eurohelp.intro.Persona;

public class FiltroPersonaNombre implements Predicate<Persona> {

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
