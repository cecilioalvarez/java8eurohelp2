package es.eurohelp.streams.interfaces2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Principal2 {

	public static void main(String[] args) {
		
		Documento d1= new Documento("titulo1",1);
		Documento d2= new Documento("titulo1",2);
		Documento d3= new Documento("titulo2",1);
		Documento d4= new Documento("titulo2",2);
		//este de aqui
		Documento d5= new Documento("titulo3",3);
		
		List<Documento> lista = Arrays.asList(d1,d2,d3,d4,d5);
	
		//bifuncion
		
		BinaryOperator<Documento> referencia= Documento::elMayor;
		
		// operacion de reducion
		// ampliar las capacidades de programacion funcional
		Documento inicial= lista.stream().reduce(d1,referencia);
		
		System.out.println(inicial.getTitulo());
		System.out.println(inicial.getVersion());
		
		

	}

}
