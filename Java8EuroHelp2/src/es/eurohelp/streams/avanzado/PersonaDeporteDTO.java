package es.eurohelp.streams.avanzado;

public class PersonaDeporteDTO {

	private String nombre;
	private String deporte="";
	
	
	public PersonaDeporteDTO(String nombre, String deporte) {
		super();
		this.nombre = nombre;
		this.deporte = deporte;
	}
	
	public PersonaDeporteDTO(Persona persona) {
		
		this.nombre= persona.getNombre();
		
		for (Deporte deporte:persona.getDeportes()) {
			
			this.deporte+=deporte.getNombre()+",";
		}
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	
}
