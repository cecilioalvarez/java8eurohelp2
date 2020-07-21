package es.eurohelp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import es.eurohelp.filtros.misfiltros2.FiltroPersonaNombre;
import es.eurohelp.intro.Persona;

public class Principal6 {

	public static void main(String[] args) {

		ArrayList<Factura> listaFacturas = new ArrayList<Factura>();
		
		
		
		
		Stream<Factura> flujoTrabajo= listaFacturas.stream();
		
		flujoTrabajo.map(Factura::getImporteConIVA).forEach(System.out::println);
		
		
	}

}
