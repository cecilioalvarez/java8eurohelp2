package es.eurohelp.intro;

public class Persona implements Comparable<Persona> {

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	private String nombre;
	private String apellidos;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona otro) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(otro.getNombre());
	}
	// para que esto nos funcione como método de referencia
	// al final un metodo de referencia no es ni mas ni menos 
	// que una funcion reutilizable o expresion lambda reutilizable
	
	// contexto de ejecucion y la funcionalidad que implementa
	
//	public static boolean estaJubilado (Persona persona) {
//		
//		return persona.getEdad()>65;
//	}
	// al objeto que estemos manejando en ese momento
	public boolean estaJubilado() {
		// a traves del uso del operador de ambito this
		return this.getEdad()>65;
	}
}
