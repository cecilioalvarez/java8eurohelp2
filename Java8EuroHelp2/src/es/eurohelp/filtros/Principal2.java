package es.eurohelp.filtros;

import java.util.ArrayList;
import java.util.List;

import es.eurohelp.filtros.misfiltros.FiltroJubilado;
import es.eurohelp.filtros.misfiltros.FiltroPersona;
import es.eurohelp.filtros.misfiltros.FiltroPersonaApellidos;
import es.eurohelp.filtros.misfiltros.FiltroPersonaNombre;
import es.eurohelp.filtros.misfiltros.FiltrosFavoritos;
import es.eurohelp.intro.Persona;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("pedro", "perez", 20));
		listaPersonas.add(new Persona("pedro", "alvarado", 30));
		listaPersonas.add(new Persona("juan", "gomez", 20));
		listaPersonas.add(new Persona("ana", "sanchez", 40));
		listaPersonas.add(new Persona("anabel", "blanco", 50));
		listaPersonas.add(new Persona("diego", "fernandez", 70));
		listaPersonas.add(new Persona("gema", "gonzalez", 75));

		
		// esta linea es la invocacion
		//List<Persona> nueva = buscarPersonas(new FiltroPersonaApellidos("gomez"), listaPersonas);

		//List<Persona> nueva = buscarPersonas(new FiltroPersonaNombre("gomez"), listaPersonas);

		// parametro una persona y como resultado un booleano
		
		//List<Persona> nueva = buscarPersonas((p)->p.getNombre().equals("anabel"), listaPersonas);

		//List<Persona> nueva = buscarPersonas(new FiltroJubilado(), listaPersonas);

		// la invocacion al metodo esta jubilado
		//referenciar al metodo esta jubilado decirle
		// que la implementacion es el metodo de la clas FiltroFavoritos.estaJubilado
		//metodo de referencia en Java 8
		
		// este es un método estatico el de esta jubilado
		List<Persona> nueva = buscarPersonas(Persona::estaJubilado, listaPersonas);

		
		
		for (Persona p : nueva) {

			System.out.println(p.getNombre() + "," + p.getApellidos());
		}

	}
	//declaracion
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
