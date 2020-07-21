package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.function.Function;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal9 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();

		List<Factura> lista = repo.buscarTodas();

		Function<String,String> capitalizar=Principal9::capitalizar;
		Function<String,String> formatear=Principal9::formatear;
		
		
		Function<String,String> componer= capitalizar.andThen(formatear);
		
		lista.stream()
		.map(Factura::getConcepto)
		.map(componer)
		.forEach(System.out::println);

	}

	public static String capitalizar(String texto) {

		return texto.substring(0, 1).toUpperCase() + texto.substring(1);
	}

	public static String formatear(String texto) {

		return "<" + texto + ">";
	}
}
