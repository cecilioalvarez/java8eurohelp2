package es.eurohelp.filtros;

import java.util.ArrayList;
import java.util.List;

import es.eurohelp.filtros.misfiltros.FiltroPersona;
import es.eurohelp.filtros.misfiltros.FiltroPersonaApellidos;
import es.eurohelp.filtros.misfiltros.FiltroPersonaNombre;
import es.eurohelp.intro.Persona;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("pedro", "perez", 20));
		listaPersonas.add(new Persona("pedro", "alvarado", 30));
		listaPersonas.add(new Persona("juan", "gomez", 20));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("anabel", "blanco", 50));

		List<Persona> nueva = buscarPersonas(new FiltroPersonaApellidos("gomez"), listaPersonas);

		for (Persona p : nueva) {

			System.out.println(p.getNombre() + "," + p.getApellidos());
		}

	}

	public static List<Persona> buscarPersonas(FiltroPersona filtro, List<Persona> milista) {

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
