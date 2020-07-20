package es.eurohelp.filtros;

import java.util.ArrayList;
import java.util.List;

import es.eurohelp.intro.Persona;

public class Principal {

	public static void main(String[] args) {
	

		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		listaPersonas.add(new Persona ("pedro","perez",20));
		listaPersonas.add(new Persona ("pedro","alvarado",30));
		listaPersonas.add(new Persona ("juan","gomez",20));
		listaPersonas.add(new Persona ("ana","sanchez",40));
		listaPersonas.add(new Persona ("anabel","blanco",50));
		
		
		List<Persona> nueva= buscarPersonasPorNombre("pedro", listaPersonas);
		
		for (Persona p:nueva) {
			
			System.out.println(p.getNombre()+","+p.getApellidos());
		}

	}
	//muy rigido
	// solo puedo filtrar por nombre
	
	// a mi me gustaria filtrar por la propiedad que necesite 
	public static List<Persona> buscarPersonasPorNombre(String nombre,List<Persona> milista) {
		
		
		List<Persona> listaFiltro= new ArrayList<Persona>();
		
		for (Persona p:milista) {
			
			if (p.getNombre().equals(nombre)) {
				
				listaFiltro.add(p);
			}
			
		}
		
		return listaFiltro;
		
		
	}

}
