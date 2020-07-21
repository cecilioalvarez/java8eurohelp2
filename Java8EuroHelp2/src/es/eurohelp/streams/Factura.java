package es.eurohelp.streams;

public class Factura  implements Comparable{

	private int numero;
	private String concepto;
	private double importe;
	
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getImporteConIVA() {
		
		return importe *1.21;
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", importe=" + importe + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		Factura f= (Factura)o;
		if (f.getNumero()>this.getNumero()) {
			
			return -1;
		}else if (f.getNumero()==this.getNumero()) {
			
			return 0;
		}else {
			
			return 1;
		}
	}
}
