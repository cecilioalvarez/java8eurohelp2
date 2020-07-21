package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal5 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();

		List<Factura> lista = repo.buscarTodas();
		
		//stream lo convierto en un stream de numeros
		// aparecen algunas operaciones adicionales 
		OptionalDouble maximo=lista.stream().mapToDouble(Factura::getImporte).max();
		
		if (maximo.isPresent()) {
			System.out.println(maximo.getAsDouble());
		}
	
	}
}
