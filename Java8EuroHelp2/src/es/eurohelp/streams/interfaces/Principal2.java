package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.function.Function;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal2 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();
		
		List<Factura> lista=repo.buscarTodas();
		
		//un ejemplo de interface Function
		// veas que recibes una factura didactito
		
		Function<Factura,String> mapeo1=(f)->f.getConcepto();
		
		// siempre es mejor esta 
		// hace referencia a un metodo que ya existe
		Function<Factura,String> mapeo2=Factura::getConcepto;
	
		
		lista.stream().map(mapeo1).forEach(System.out::println);
		
	}

}
