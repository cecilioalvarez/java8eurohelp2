package es.eurohelp.streams.avanzado;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	List<Deporte> deportes= new ArrayList<Deporte>();

	public List<Deporte> getDeportes() {
		return deportes;
	}

	public void setDeportes(List<Deporte> deportes) {
		this.deportes = deportes;
	}

	public void addDeporte(Deporte deporte) {
		
		this.deportes.add(deporte);
	}
	
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
	public boolean esMayorDeEdad() {
		
		if (edad>=18) {
			return true;
		}else {
			return false;
		}
	}
}
