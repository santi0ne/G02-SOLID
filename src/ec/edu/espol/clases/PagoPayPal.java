package ec.edu.espol.clases;

import ec.edu.espol.interfaces.Pagable;

public class PagoPayPal implements Pagable{
	private boolean loggedIn; //conexion a cuenta PayPal

	@Override
	public void realizarcobro(double monto) {
		if(!loggedIn) {
			return;
		}
			
	}
	
}
