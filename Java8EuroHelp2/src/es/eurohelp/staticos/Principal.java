package es.eurohelp.staticos;

public class Principal {

	public static void main(String[] args) {
		
		
		Ropa r1= new Ropa(20);
		System.out.println(r1.getPrecio());
		
		Seguro s1= new Seguro(30);
		System.out.println(s1.getPrecio());

		//System.out.println(Producto.mayor(r1, s1).getPrecio());
		System.out.println(r1.esMayor(s1).getPrecio());
		
		
	}

}
