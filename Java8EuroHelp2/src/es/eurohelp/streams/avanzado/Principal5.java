package es.eurohelp.streams.avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal5 {

	public static void main(String[] args) {
		
		
		List<Persona> lista= new ArrayList<Persona>();
		
		Persona p1= new Persona ("juan","gomez",15);
		p1.addDeporte(new Deporte("padel",30));
		p1.addDeporte(new Deporte("natacion",10));
		
		Persona p2= new Persona ("ana","sanchez",14);
		p2.addDeporte(new Deporte("padel",30));
		p2.addDeporte(new Deporte("tenis",10));
		
		Persona p3= new Persona ("david","gomez",20);
		p3.addDeporte(new Deporte("futbol",30));
		p3.addDeporte(new Deporte("natacion",10));
		
		Persona p4= new Persona ("federico","sanchez",20);
		p4.addDeporte(new Deporte("padel",30));
		p4.addDeporte(new Deporte("tenis",10));
		
		
		Persona p5= new Persona ("blanca","sanchez",20);
		p5.addDeporte(new Deporte("padel",30));
		p5.addDeporte(new Deporte("tenis",10));
		
		
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		int total=lista.
				stream()
				.flatMap((p)->p.getDeportes().stream())
				.filter((d)->d.getNombre()
				.equals("padel"))
				.mapToInt(Deporte::getHoras).sum();
		
		System.out.println(total);
		
	}

}
