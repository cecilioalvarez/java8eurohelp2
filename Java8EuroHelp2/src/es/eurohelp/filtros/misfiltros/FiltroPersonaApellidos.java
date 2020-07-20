package es.eurohelp.filtros.misfiltros;

import es.eurohelp.intro.Persona;

public class FiltroPersonaApellidos implements FiltroPersona {

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
