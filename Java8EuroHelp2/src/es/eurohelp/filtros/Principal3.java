package es.eurohelp.filtros;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import es.eurohelp.filtros.misfiltros2.FiltroPersonaNombre;
import es.eurohelp.intro.Persona;

public class Principal3 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("pedro", "perez", 20));
		listaPersonas.add(new Persona("pedro", "alvarado", 30));
		listaPersonas.add(new Persona("juan", "gomez", 20));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("anabel", "blanco", 50));
		listaPersonas.add(new Persona("diego", "fernandez", 70));
		listaPersonas.add(new Persona("gema", "gonzalez", 75));

		Stream<Persona> flujoTrabajo= listaPersonas.stream();
		flujoTrabajo
		// no usas para recorrer un bucle for
		// sino que usas funciones para definir las tareas a realizar
		//.filter(p->!p.getNombre().equals("pedro"))
		.filter(p->p.getNombre().equals("ana"))
		.forEach((p)->System.out.println(p.getNombre()));
	}	

}
