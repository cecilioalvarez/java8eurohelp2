package es.eurohelp.streams.interfaces2;

public class Documento {

	private String titulo;
	// el documento es versionable
	private int version;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Documento(String titulo, int version) {
		super();
		this.titulo = titulo;
		this.version = version;
	}
	
	// el que tiene la version mayor
	// cumple con que es un BiFunction<Documento,Documento,Documento>
	
	public static Documento elMayor(Documento documento1,Documento documento2) {
		
		if (documento1.getVersion()>documento2.getVersion()) {
			
			return documento1;
		}else {
			return documento2;
		}
	}
	
}
