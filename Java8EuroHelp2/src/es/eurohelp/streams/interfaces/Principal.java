package es.eurohelp.streams.interfaces;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

import es.eurohelp.streams.Factura;
import es.eurohelp.streams.RepositorioFacturas;

public class Principal {

	public static void main(String[] args) {
	
		RepositorioFacturas repo= new RepositorioFacturas();
		// definir un puntero a una funcion en Java
		
		Consumer<Factura> miconsumidor=(f)->System.out.println("la factura es"+ f.getConcepto());
		Consumer<Factura> consumidorFichero=Principal::crearCarpetas;
		
		Consumer<Factura> consumidorCombinado= consumidorFichero.andThen(Principal::formatoFactura);
		
		List<Factura> lista= repo.buscarTodas();
		
//		lista.stream().forEach((Factura f)-> {
//			
//			System.out.println("mi factura es " +f.getConcepto());
//		});
		
		//lista.stream().forEach(miconsumidor);

		lista.stream().forEach(consumidorCombinado);
	}
	
	
	
	// funcion que yo me he declarado , es statica
	// ademases una funcion que recibe un parametro
	// y no devuelve nada por lo tanto es un consumidor
	// en este caso recordemos q un consumidor es un tipo generico
	// este es de factura
	public static void crearCarpetas(Factura factura) {
		//esto añade funcionalidad pero reduce la reutilizacion del metodo
		
		
		new File(factura.getConcepto()).mkdir();
		
	}
	
	public static void formatoFactura(Factura factura) {
		
		System.out.println("se crea la carpeta"+ factura.getConcepto());
		
	}
	

}
