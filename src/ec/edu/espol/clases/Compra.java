package ec.edu.espol.clases;

public class Compra {
	private Pago pago;
	private PagoPayPal pagoPayPal;
	private Compra(Pago pago) {
		//inicializaciones
	}
	public Compra(PagoPayPal pagoPayPal) {
		//inicializaciones
	}
	public void agregarArticulo(Articulo articulo) {
		//agregar un articulo a la compra
	}
	public void removerArticulo(Articulo articulo) {
		//remover un articulo a la compra
	}
}
