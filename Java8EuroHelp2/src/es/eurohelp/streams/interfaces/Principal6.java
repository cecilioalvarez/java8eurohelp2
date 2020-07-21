package es.eurohelp.streams.interfaces;

import java.util.Comparator;
import java.util.List;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal6 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();

		List<Factura> lista = repo.buscarTodas();

		//lista.stream().sorted().forEach(System.out::println);
		
		Comparator<Factura> comparador= Comparator.comparing(Factura::getImporte).thenComparing(Factura::getConcepto);
		
		lista.stream().sorted(comparador).forEach(System.out::println);
		
		// a partir de una lista de facturas calcular el precio medio con iva de todas aquellas que superen lso 100 euros 
		// de importe base 
	}
}
