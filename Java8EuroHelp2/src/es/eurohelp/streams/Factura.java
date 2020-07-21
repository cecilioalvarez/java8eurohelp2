package es.eurohelp.streams;

public class Factura {

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
}
