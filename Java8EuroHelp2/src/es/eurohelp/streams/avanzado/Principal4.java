package es.eurohelp.streams.avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Principal4 {

	public static void main(String[] args) {
		
		
		List<Persona> lista= new ArrayList<Persona>();
		
		Persona p1= new Persona ("juan","gomez",20);
		p1.addDeporte(new Deporte("padel",30));
		p1.addDeporte(new Deporte("natacion",10));
		
		Persona p2= new Persona ("ana","sanchez",20);
		p2.addDeporte(new Deporte("padel",30));
		p2.addDeporte(new Deporte("tenis",10));
		
		lista.add(p1);
		lista.add(p2);
		
		// persona -> lista de deportes
		
		// juan,padel
		
//		PersonaDeporteDTO  dto= new PersonaDeporteDTO(p1);
//		System.out.println(dto.getNombre());
//		System.out.println(dto.getDeporte());
		// un constructor reference para cargar las propiedades que nos interesen
		
		lista.stream().map(PersonaDeporteDTO:: new).forEach((dto)-> {
			
					System.out.println(dto.getNombre());
					System.out.println(dto.getDeporte());
					
			
		});
		
		
		
	}

}
