package ec.edu.espol.clases;

import ec.edu.espol.interfaces.IPagoPayPal;

public class PagoPayPal implements IPagoPayPal{
	private boolean loggedIn; //conexion a cuenta PayPal

	@Override
	public void realizarCobro(double monto) {
		if(!loggedIn)
			return;
		// cargar el monto de compra al medio pago
		
	}
	
}
