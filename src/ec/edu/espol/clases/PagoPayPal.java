package ec.edu.espol.clases;

import ec.edu.espol.interfaces.IPagoPayPal;
import ec.edu.espol.interfaces.Pagable;

public class PagoPayPal implements IPagoPayPal, Pagable{
	private boolean loggedIn; //conexion a cuenta PayPal

	@Override
	public void realizarCobro(double monto) {
		if(!loggedIn)
			return;
		// cargar el monto de compra al medio pago
		
	}

	@Override
	public void realizarcobro() {
		// TODO Auto-generated method stub
		
	}
	
}
