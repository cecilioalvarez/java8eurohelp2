package es.eurohelp.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal9 {

	public static void main(String[] args) {

		
		RepositorioFacturas repo= new RepositorioFacturas();
		List<Factura> lista= repo.buscarTodas();
		
		Stream<Factura> flujo= lista.stream();
		
		//flujo.map((f)->f.getImporte()).forEach(System.out::println);
		
		flujo
		.map((f)->f.getImporte())
		.reduce((acumulador,valor)-> {
			return acumulador+valor;
		}).ifPresent(System.out::println);
	}

}
