package ec.edu.espol.clases;

public class PagoPayPal extends Pago{
	private boolean loggedIn; //conexion a cuenta PayPal
	@Override
	public void realizarCobro(double monto) {
		if(!loggedIn) {
			return;
		}
		//cargar el monto de compra al medio de pago
	}
}
