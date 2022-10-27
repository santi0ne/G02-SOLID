package ec.edu.espol.interfaces;

public interface IPago {
	void realizarCobro(double monto);
	void calcularImpuestosFactura();
	void generarFactura();
}
