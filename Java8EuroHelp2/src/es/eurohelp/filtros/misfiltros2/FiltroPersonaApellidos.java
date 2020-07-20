package es.eurohelp.filtros.misfiltros2;

import java.util.function.Predicate;

import es.eurohelp.intro.Persona;

public class FiltroPersonaApellidos implements Predicate<Persona>{

	private String apellidos;
	
	
	
	public FiltroPersonaApellidos(String apellidos) {
		super();
		this.apellidos = apellidos;
	}



	@Override
	public boolean test(Persona persona) {
		
		if (persona.getApellidos().equals(apellidos)) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}

}
