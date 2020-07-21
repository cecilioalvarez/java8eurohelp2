package es.eurohelp.streams.interfaces;

import java.util.function.Supplier;

import es.eurohelp.streams.Factura;

public class Principal4 {

	public static void main(String[] args) {

		// es un interface que no recibe nada pero devuelve algo 
		
		Supplier<Factura> obtenerFactura= ()-> new Factura(1,"ordenador",200);
		Factura f= obtenerFactura.get();	
		System.out.println(f);
		
		
	}
}
