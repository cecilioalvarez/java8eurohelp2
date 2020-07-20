package es.eurohelp.staticos;

public class Seguro implements Producto{

	private int precio;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Seguro(int precio) {
		super();
		this.precio = precio;
	}


	
	
}
