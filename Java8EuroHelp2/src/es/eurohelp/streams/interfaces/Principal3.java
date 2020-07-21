package es.eurohelp.streams.interfaces;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal3 {

	public static void main(String[] args) {

		RepositorioFacturas repo = new RepositorioFacturas();
		List<Factura> lista = repo.buscarTodas();

		Map<Integer,Factura> mapa= lista.stream().collect(Collectors.toMap(Factura::getNumero,f->f));
		
		System.out.println(mapa.get(1).getConcepto());
		
	}

}
