package es.eurohelp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepositorioFacturas {

	static ArrayList<Factura> listaFacturas = new ArrayList<Factura>();

	static {

		listaFacturas.add(new Factura(4, "java", 20));
		listaFacturas.add(new Factura(3, "net", 30));
		listaFacturas.add(new Factura(2, "php", 40));
		listaFacturas.add(new Factura(2, "ajax", 40));
		listaFacturas.add(new Factura(1, "linux", 10));
		listaFacturas.add(new Factura(7, "net", 120));
		listaFacturas.add(new Factura(8, "php", 130));
		listaFacturas.add(new Factura(9, "ajax", 140));
		listaFacturas.add(new Factura(10, "linux", 150));

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
