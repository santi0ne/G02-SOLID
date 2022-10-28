package ec.edu.espol.clases;

import ec.edu.espol.interfaces.Pagable;

public class Notificacion {
	
	private int tipoNotificacion;
	
	public void notificar(Pagable pago) {
		if(tipoNotificacion==1) {
			//enviarEmail();
		}
		else {
			//enviarSMS();
		}
	}
}
