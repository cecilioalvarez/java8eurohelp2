package es.eurohelp.streams.interfaces2;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Documento d1= new Documento("titulo1",1);
		Documento d2= new Documento("titulo1",2);
		Documento d3= new Documento("titulo2",1);
		Documento d4= new Documento("titulo2",2);
		//este de aqui
		Documento d5= new Documento("titulo3",3);
		
		List<Documento> lista = Arrays.asList(d1,d2,d3,d4,d5);
		
		Documento inicial= lista.get(0);
		for (Documento d:lista) {
			
			if (inicial.getVersion()<d.getVersion()) {
				
				inicial=d;
			}
		}
		
		System.out.println(inicial.getTitulo());
		System.out.println(inicial.getVersion());
		
		

	}

}
