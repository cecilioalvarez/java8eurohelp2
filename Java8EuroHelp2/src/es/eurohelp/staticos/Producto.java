package es.eurohelp.staticos;

public interface Producto {

	public int getPrecio();
	
//	public static  Producto esMayor(Producto a ,Producto b) {
//		
//		if (a.getPrecio()>b.getPrecio()) {
//			
//			return a;
//			
//		}
//		else return b;
//	}
	
	public default Producto esMayor (Producto producto) {
		
		if (this.getPrecio()>producto.getPrecio()) {
			
			return this;
		}else {
			return producto;
		}
	}
	
}
