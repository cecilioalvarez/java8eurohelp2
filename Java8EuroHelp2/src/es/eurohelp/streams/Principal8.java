package es.eurohelp.streams;

import java.util.List;
import java.util.Optional;

public class Principal8 {

	public static void main(String[] args) {

		
		RepositorioFacturas repo= new RepositorioFacturas();
		List<Factura> lista= repo.buscarTodas();
		
		//Optional<String> micadena= Optional.of("hola");
		Optional<String> micadena= Optional.empty();
		
		if (micadena.isPresent()) {
			
			System.out.println(micadena.get());
		}
		
		
		
		
		
		
	}

}
