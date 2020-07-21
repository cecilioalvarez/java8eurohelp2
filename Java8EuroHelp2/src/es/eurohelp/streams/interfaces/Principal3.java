package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.function.Function;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal3 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();

		List<Factura> lista = repo.buscarTodas();

		lista.stream().map(Factura::getConcepto).map(Principal3::capitalizar).map(Principal3::formatear)
				.forEach(System.out::println);

	}

	public static String capitalizar(String texto) {

		return texto.substring(0, 1).toUpperCase() + texto.substring(1);
	}

	public static String formatear(String texto) {

		return "<" + texto + ">";
	}
}
