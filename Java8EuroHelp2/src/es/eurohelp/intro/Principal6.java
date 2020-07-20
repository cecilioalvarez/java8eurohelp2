package es.eurohelp.intro;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal6 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("pedro", "perez", 20));
		listaPersonas.add(new Persona("juan", "gomez", 20));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("anabel", "blanco", 50));
		// linea para ordenar

		// una clase interna de java
		// inner class

		// expresion lambda
		// es una funcion anonima
		
		// y ordeno , lo hago sobre una lista de personas
		
		listaPersonas.sort((p1, p2)-> p1.getNombre().compareTo(p2.getNombre()));

		for (Persona p : listaPersonas) {

			System.out.println(p.getNombre());
		}

	}

}
