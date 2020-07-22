package es.eurohelp.streams.interfaces2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Principal3 {

	public static void main(String[] args) {
		
		Documento d1= new Documento("titulo1",1);
		Documento d2= new Documento("tituloA",2);
		Documento d3= new Documento("titulo2",1);
		Documento d4= new Documento("tituloB",2);
		//este de aqui
		Documento d5= new Documento("tituloC",3);
		
		List<Documento> lista = Arrays.asList(d1,d2,d3,d4,d5);
	
//		
//		lista.stream()
//		.filter((d)->d.getVersion()>1)
//		.map(Documento::getTitulo)
//		.forEach(System.out::println);
		
		
		// quiero sacar todos los docuemntos que son mayores que otro documento concreto
		
		
		List<Documento> listaNueva= filtrar(lista,Principal3::mayorQueOtro,d4);
		
		listaNueva.stream().map(Documento::getTitulo).forEach(System.out::println);

	}
	
	
	public static List<Documento> filtrar(List<Documento> lista,
			BiPredicate<Documento,Documento> predicado,Documento documentoComparar) {
		
		return lista.stream().filter((doc)->predicado.test(doc, documentoComparar))
				.collect(Collectors.toList());
		
		
	}
	
	

	/// a nivel de programación funcional
	//Predicate porque recibe parametros y devuelve booleanos
	// BiPredicate 
	
	public static boolean mayorQueOtro(Documento documento,Documento documentoComparar) {
	
		if (documento.getVersion()>documentoComparar.getVersion()) {
			
			return true;
		}else {
			return false;
		}
		
	}
}
