package es.eurohelp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepositorioFacturas {

	static ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

	static {

		listaFacturas.add(new Factura(1, "java", 20));
		listaFacturas.add(new Factura(2, "net", 30));
		listaFacturas.add(new Factura(3, "php", 40));
		listaFacturas.add(new Factura(4, "linux", 10));

	}

	public List<Factura> buscarTodas() {

		return listaFacturas;
	}

	public List<Factura> buscarTodasTransformadas() {

		Stream<Factura> flujo= listaFacturas.stream();
		 
		List<Factura> lista=flujo
		.filter((f)->f.getImporte()>10.0)
		.map((f)->new Factura (f.getNumero()+5,f.getConcepto().toUpperCase(),f.getImporte()))
		.collect(Collectors.toList());
		return lista;
		
	}

}
