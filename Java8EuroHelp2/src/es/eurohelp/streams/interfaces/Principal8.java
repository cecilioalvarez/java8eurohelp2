package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.stream.IntStream;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal8 {

	public static void main(String[] args) {
		
		
		IntStream.range(0, 100).skip(10).limit(20).forEach(System.out::println);

	}

}
