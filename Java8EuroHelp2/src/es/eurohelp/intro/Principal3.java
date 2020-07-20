package es.eurohelp.intro;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal3 {

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
		
		listaPersonas.sort((Persona p1, Persona p2)-> {

				if (p1.getEdad() == p2.getEdad()) {

					return 0;
				} else if (p1.getEdad() > p2.getEdad()) {
					return 1;
				} else {
					return -1;
				}

			}
		);

		for (Persona p : listaPersonas) {

			System.out.println(p.getNombre());
		}

	}

}
