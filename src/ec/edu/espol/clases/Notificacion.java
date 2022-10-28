package ec.edu.espol.clases;

import ec.edu.espol.interfaces.Notificar;
import ec.edu.espol.interfaces.Pagable;

public class Notificacion {
	
	
	public void notificar(Pagable pago, Notificar tipoNotificacion) {
		tipoNotificacion.enviarNotificacion(pago);
	}
}
