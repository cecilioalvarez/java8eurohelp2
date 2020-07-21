package es.eurohelp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import es.eurohelp.filtros.misfiltros2.FiltroPersonaNombre;
import es.eurohelp.intro.Persona;

public class Principal5 {

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
		
		// trazabilidad 
		
		Stream<Integer> otroFlujo= flujoTrabajo.filter((p)->!p.estaJubilado())
		.peek(p->System.out.println("la persona es:"+ p.getNombre()))
		.map((p)->p.getEdad())
		.peek(e->System.out.println("su edad es :"+e))
		.map((edad)->65-edad)
		.peek(e->System.out.println("falta para jubilarse :"+e));
		
		// finalizadores de los streams
		otroFlujo.forEach(System.out::println);
		
	}
		
		

}
