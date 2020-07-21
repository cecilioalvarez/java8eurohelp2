package es.eurohelp.filtros;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import es.eurohelp.filtros.misfiltros2.FiltroPersonaNombre;
import es.eurohelp.intro.Persona;

public class Principal4 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("pedro", "perez", 20));
		listaPersonas.add(new Persona("pedro", "alvarado", 30));
		listaPersonas.add(new Persona("juan", "gomez", 20));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("anabel", "blanco", 50));
		listaPersonas.add(new Persona("diego", "fernandez", 70));
		listaPersonas.add(new Persona("gema", "gonzalez", 75));

		Predicate<Persona> filtroPedros = new FiltroPersonaNombre("pedro");

		Predicate<Persona> filtroPedrosyJubilados = filtroPedros.or(Persona::estaJubilado);

		List<Persona> nueva = buscarPersonas(filtroPedrosyJubilados, listaPersonas);

		for (Persona p : nueva) {

			System.out.println(p.getNombre() + "," + p.getApellidos());
		}

	}

	// declaracion
	public static List<Persona> buscarPersonas(Predicate<Persona> filtro, List<Persona> milista) {

		List<Persona> listaFiltro = new ArrayList<Persona>();

		for (Persona p : milista) {

			// el filtrado la persona lo pasa
			// añadimos la persona a la lista
			if (filtro.test(p)) {

				listaFiltro.add(p);
			}

		}

		return listaFiltro;

	}

}
