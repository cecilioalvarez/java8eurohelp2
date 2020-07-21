package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal10 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();

		List<Factura> lista = repo.buscarTodas();

		OptionalDouble resultado=lista
				.stream()
				.filter((f)->f.getImporte()>=100)
				.mapToDouble(Factura::getImporte)
				.map(i->i*1.21)
				.average();
		
		System.out.println(resultado.getAsDouble());
}
}