package es.eurohelp.streams.interfaces;

import java.util.Comparator;

import es.eurohelp.streams.Factura;

public class ComparatorImporteFacturas implements Comparator<Factura> {

	@Override
	public int compare(Factura f1, Factura f2) {
		if (f1.getImporte()>f2.getImporte()) {
			
			return 1;
		}else if (f1.getImporte()==f2.getImporte()) {
			
			return 0;
		}else {
			
			return -1;
		}
		
	}

}
