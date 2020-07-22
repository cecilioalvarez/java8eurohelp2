package es.eurohelp.streams.avanzado;

public class Deporte implements Comparable<Deporte>{

	private String nombre;
	private int horas;
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deporte other = (Deporte) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Deporte(String nombre, int horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Deporte [nombre=" + nombre + ", horas=" + horas + "]";
	}

	@Override
	public int compareTo(Deporte o) {
		
		return this.getNombre().compareTo(o.getNombre());
	}
	
	
}
