package es.eurohelp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import es.eurohelp.filtros.misfiltros2.FiltroPersonaNombre;
import es.eurohelp.intro.Persona;

public class Principal8 {

	public static void main(String[] args) {

		
		RepositorioFacturas repo= new RepositorioFacturas();
		List<Factura> lista= repo.buscarTodasTransformadas();
		
		for (Factura f: lista) {
			
			System.out.println(f.getConcepto());
		}
		
		
		
	}

}
