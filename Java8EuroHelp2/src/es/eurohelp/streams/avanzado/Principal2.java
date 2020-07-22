package es.eurohelp.streams.avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Principal2 {

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
		
		//lista.stream().map(Persona::getNombre).forEach(System.out::println);
		
		//lista.stream().map((p)->p.getDeportes().get(0)).map(Deporte::getNombre).forEach(System.out::println);
		
		Set<Deporte> deportes=lista
		.stream()
		// por favor aplana el stream y convierte los items en elementos del nuevo stream
		.flatMap((p)->p.getDeportes().stream()).collect(Collectors.toSet());
		
		System.out.println(deportes.size());
		
		
	}

}
