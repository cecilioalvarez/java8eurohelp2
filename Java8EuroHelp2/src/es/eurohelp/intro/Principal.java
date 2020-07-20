package es.eurohelp.intro;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		listaPersonas.add(new Persona ("pedro","perez",20));
		listaPersonas.add(new Persona ("juan","gomez",20));
		listaPersonas.add(new Persona ("ana","sanchez",40));
		listaPersonas.add(new Persona ("anabel","blanco",50));
		// linea para ordenar
		
		listaPersonas.sort(new ComparadorApellido());
		
		
		for (Persona p: listaPersonas) {
			
			System.out.println(p.getApellidos());
		}
		

	}

}
